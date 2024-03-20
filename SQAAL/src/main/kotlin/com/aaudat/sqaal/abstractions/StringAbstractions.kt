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
abstract class StringAbstractions {

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
}