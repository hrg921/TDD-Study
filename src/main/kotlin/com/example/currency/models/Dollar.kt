package com.example.currency.models

data class Dollar(override val amount: Int): Money(amount) {
    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}