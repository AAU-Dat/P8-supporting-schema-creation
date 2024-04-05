package com.aaudat.sqaal.abstractions

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StringAbstractionsTest {
    private val testStringAbstractions: StringAbstractions = StringAbstractions()

    @Test
    fun testNoSubset() {
        assertThrows(IndexOutOfBoundsException::class.java) {
            testStringAbstractions.belongs("cc","a* b* ab(c|d)*")
        }
    }

    @Test
    fun testSubset() {
        testStringAbstractions.belongs("abcd", "a* b* ab(c|d)*")

        testStringAbstractions.belongs("a", "a* b* ab(c|d)*")

        testStringAbstractions.belongs("b", "a* b* ab(c|d)*")
    }
}