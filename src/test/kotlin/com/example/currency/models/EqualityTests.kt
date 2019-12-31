package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class EqualityTests {
    @Test
    fun `five Dollars times two equals ten Dollars and five Dollars times three equals fifteen Dollars`() {
        val five = Dollar(5)
        assertTrue(Dollar(10) == five.times(2))
        assertTrue(Dollar(15) == five.times(3))
    }

    @Test
    fun `five Francs times two equals ten Francs and five Francs times three equals fifteen Francs`() {
        val five = Franc(5)
        assertTrue(Franc(10) == five.times(2))
        assertTrue(Franc(15) == five.times(3))
    }

    @Test
    fun `five Francs equals five Dollars`() {
        assertTrue(Franc(5).equals(Dollar(5)))
    }
}