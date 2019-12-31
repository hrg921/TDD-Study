package com.example.currency.models

data class Dollar(override val amount: Int, override val currency: String = "USD"): Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return dollar(amount * multiplier)
    }
}