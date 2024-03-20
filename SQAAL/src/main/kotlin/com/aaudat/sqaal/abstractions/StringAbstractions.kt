package com.aaudat.sqaal.abstractions

import dk.brics.automaton.Automaton
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