package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


const val initialAmount: Int = 5

class DollarTests {
    @Test
    fun `Two timed five dollars are ten dollars`() {
        val five = Dollar(initialAmount)
        var product = five.times(2)
        assertTrue(Dollar(10) == product)
        product = five.times(3)
        assertTrue(Dollar(15) == product)
    }
}
