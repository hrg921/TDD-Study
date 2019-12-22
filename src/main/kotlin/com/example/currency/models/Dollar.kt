package com.example.currency.models

class Dollar(var amount: Int) {
    fun times(multiplier: Int) {
        this.amount = this.amount * multiplier
    }
}