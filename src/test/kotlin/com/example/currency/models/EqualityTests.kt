package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class EqualityTests {
    @Test
    fun `five Francs equals five Dollars`() {
        assertTrue(Franc(5).equals(Dollar(5)))
    }
}