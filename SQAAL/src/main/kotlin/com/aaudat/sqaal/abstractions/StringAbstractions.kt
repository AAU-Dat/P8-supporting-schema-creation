package com.aaudat.sqaal.abstractions
import dk.brics.automaton.Automaton
import dk.brics.automaton.RegExp
import net.sf.jsqlparser.statement.Statement

/**
 * Class for handling the abstractions of String values
 *
 * ### String representation
 * - Regular expressions
 *
 * ### Library for abstract representation
 * - [dk.brics.automaton]
 */
class StringAbstractions {

    /**
     * Function for creating a [RegExp] from a [String]
     * @param parsedast todo: Unsure what to give at the moment. Potential types could be [String] and [Statement]
     * @return [RegExp]
     */
    private fun toRegExp(parsedast: String): RegExp {
        val re = RegExp(parsedast);
        return re
        TODO("Convert ??? (maybe parsed SQL AST or String) to Regular Expression")
    }

    /**
     * Function for creating an [Automaton] from a [RegExp]
     * @param re [RegExp]: Used for creating the [Automaton]
     * @return [Automaton]: The created [Automaton]
     */
    private fun toAutomata(re: RegExp): Automaton {
        val automaton = re.toAutomaton()
        return automaton
    }

    /**
     * Function for checking whether the languages of two automatas are equal
     * @return [Boolean] - True if languages are equal; else false
     * @param a First [Automaton]
     * @param b Second [Automaton]
     */
    private fun isEqual(a: Automaton, b: Automaton): Boolean {
        val isEqual: Boolean = a == b
        return isEqual
    }

    /**
     * Checks if the language of automaton [a] is a subset of the language of automaton [b]
     * @param a [Automaton]: Presumed subset of [b]
     * @param b [Automaton]: Presumed superset of [a]
     * @return [Boolean] - True if language of [a] is subset of language of [b]
     */
    private fun isSubset(a: Automaton, b: Automaton): Boolean {
        val isSubset: Boolean = a.subsetOf(b)
        return isSubset
    }

    /**
     * Check if a regular expression is a subset of a collection/lattice of other regular expressions
     * @param regEx The regular expression that you want to check whether is in the lattice or not
     * @param latticeString The [String] of regular expressions (separated by spaces) that are used to form the lattice
     * @return [Automaton] - The least fixed point subset from the lattice that is a superset of the given regular expression
     * @exception [IndexOutOfBoundsException] If there are no supersets of the given regular expression in the lattice
     */
    fun belongs(
        regEx: String,
        latticeString: String
    ): Automaton {
        /**
         * In the following, we will work with automatons made from regular expressions, as our framework has several useful functions implemented for automatons
         */

        /** Convert the given string to a regular expression and then an automaton */
        val regExAut = RegExp(regEx).toAutomaton()

        /** Splits the string of regular expression strings given in the second argument by "spaces"
         * Then converts them to regular expressions and then automatons
         */
        val paramList = latticeString.split(" ")
        val autList = emptyList<Automaton>().toMutableList()
        for (rexp in paramList) {
            autList += RegExp(rexp).toAutomaton()
        }

        /**
         * Creates the complete lattice based on the regular expressions given as the second parameter
         */
        val lattice = lattice(autList)

        /**
         * Creates the list of regular expressions/automatas from [lattice] that are supersets of the given regular expression [regEx]
         */
        val subsetList = emptyList<Automaton>().toMutableList()
        for (aut in lattice) {
            if (regExAut.subsetOf(aut)) {
                subsetList += aut
            }
        }

        /**
         * Find the least fixed point in the [lattice] that can still represent [regEx]
         * Throws an [IndexOutOfBoundsException] if there are no supersets of [regEx] in the [lattice]
         */
        try {
            /**
             * Intersection of all supersets of [regEx] in the [lattice]
             */
            var minAut: Automaton = subsetList[0]
            for (i in 1..<subsetList.size) {
                minAut = minAut.intersection(subsetList[i])
            }

            /**
             * List of which superset regular expressions that have an equivalent language to [regEx]
             * Printed as a boolean list, where [true] means that the language of superset at index i is equivalent to the language of [regEx]
             */
            val equivBoolList = emptyList<Boolean>().toMutableList()
            for (reg in subsetList) {
                equivBoolList += regExAut == reg
            }
            println(equivBoolList)

            /**
             * @return Intersection of all supersets of [regEx] in the [lattice]
             */
            return minAut


        } catch (e: Exception) {
            println("$regEx is not a subset of $paramList")
            throw e // TODO: use log (RUNGE)
        }

    }

    /**
     * Recursive function for creating a lattice given a list of [Automaton].
     * Takes the union and intersection of all [Automaton] in [list].
     * @param list A list of [Automaton]s that are going to form the lattice
     * @return [List] of all the distinct [Automaton] in the lattice
     */
    private fun lattice(
        list: List<Automaton>
    ): List<Automaton> {
        val newList = mutableListOf<Automaton>()

        /**
         * Union and intersection of all [Automaton] in [list]
         */
        for (aut in list) {
            for (aut2 in list) {
                newList += aut.union(aut2)
                newList += aut.intersection(aut2)
            }
        }

        /**
         * Sort out duplicate [Automaton]
         */
        val newList2 = newList.distinct()
        return if (newList2 == list) {
            /**
             * Terminate and return the final list if the above computations proved to provide the same list
             */
            newList2
        } else {
            /**
             * If [list] and [newList2] are not equal, it means that we are not done.
             * Therefore, we call the function again recursively
             */
            lattice(newList2)
        }
    }
}