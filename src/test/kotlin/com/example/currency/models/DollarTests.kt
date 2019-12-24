package com.example.currency.models

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class DollarTests {
    @Test
    fun `five Dollars times two equals ten Dollars and five Dollars times three equals fifteen Dollars`() {
        val five = Dollar(5)
        assertTrue(Dollar(10) == five.times(2))
        assertTrue(Dollar(15) == five.times(3))
    }
}
