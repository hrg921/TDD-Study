package com.example.currency.models

data class Franc(var amount: Int) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}