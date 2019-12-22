package com.example.currency.models

data class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}