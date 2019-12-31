package com.example.currency.models

abstract class Money(open val amount: Int) {
    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun franc(amount: Int): Franc {
            return Franc(amount)
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