package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


const val initialAmount: Int = 5
const val multiplier: Int = 2

class DollarTests {
    @Test
    fun `Two timed five dollars are ten dollars`() {
        val five = Dollar(initialAmount)
        var product = five.times(2)
        assertEquals(10, product.amount);
        product = five.times(3)
        assertEquals(15, product.amount)
    }
}
