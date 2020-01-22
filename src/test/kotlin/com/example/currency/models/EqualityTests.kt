package com.example.currency.models

import com.example.Money
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class EqualityTests {
    @Test
    fun `five Francs not equals five Dollars`() {
        assertFalse(Money.franc(5) == Money.dollar(5))
    }

    @Test
    fun `five Francs equals five Francs`() {
        assertTrue(Money.franc(5) == Money.franc(5))
    }

    @Test
    fun `five Francs not equals six Francs`() {
        assertFalse(Money.franc(5) == Money.franc(6))
    }

    @Test
    fun `five Dollars equals five Dollars`() {
        assertTrue(Money.dollar(5) == Money.dollar(5))
    }

    @Test
    fun `five Dollars not equals Six Dollars`() {
        assertFalse(Money.dollar(5) == Money.dollar(6))
    }
}