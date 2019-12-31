package com.example.currency.models

data class Franc(override val amount: Int, override val currency: String = "CHF"): Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return franc(amount * multiplier)
    }
}