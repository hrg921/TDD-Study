package com.example.currency.models

abstract class Money(open val amount: Int, open val currency: String) {
    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Franc(amount, "CHF")
        }
    }

    final override fun equals(other: Any?): Boolean {
        print(other)
        if (other !is Money) {
            return false
        }
        return amount == other.amount
    }

    override fun hashCode(): Int {
        return amount
    }

    abstract fun times(multiplier: Int): Money
}