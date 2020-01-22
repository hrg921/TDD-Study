package com.example.currency.models

import com.example.Bank
import com.example.Expression
import com.example.Money
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AddTests {
    @Test
    fun `five Dollars + five Dollars = 10 Dollars`() {
        val five: Money = Money.dollar(5)
        val sum: Expression = five.plus(five)
        val bank = Bank()
        val reduced: Money = bank.reduce(sum, "USD")
        assertTrue(Money.dollar(10) == reduced)
    }
}