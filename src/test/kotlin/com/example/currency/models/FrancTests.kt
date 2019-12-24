package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class FrancTests {
    @Test
    fun `five Francs times two equals ten Francs and five Francs times three equals fifteen Francs`() {
        val five = Franc(5)
        assertTrue(Franc(10) == five.times(2))
        assertTrue(Franc(15) == five.times(3))
    }
}