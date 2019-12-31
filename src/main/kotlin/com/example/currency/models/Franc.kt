package com.example.currency.models

data class Franc(override val amount: Int): Money(amount) {
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}