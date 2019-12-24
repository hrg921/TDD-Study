package com.example.currency.models

data class Franc(private var amount: Int) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}