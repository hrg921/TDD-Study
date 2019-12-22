package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


val initialAmount: Number = 5
val multiplier: Number = 2

class DollarTests {
    @Test
    fun `Two timed ${initialAmount} dollars are ${initialAmount * multiplier} dollars`() {
        five = Dollar(initialAmount)
        five.times(multiplier);
        assertEquals(10, five.amount);
    }
}
