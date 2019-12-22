package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


const val initialAmount: Int = 5
const val multiplier: Int = 2

class DollarTests {
    @Test
    fun `Two timed five dollars are ten dollars`() {
        val five = Dollar(initialAmount)
        five.times(multiplier);
        assertEquals(10, five.amount);
    }
}
