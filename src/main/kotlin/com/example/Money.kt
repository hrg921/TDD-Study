package com.example

class Money(val amount: Int, private val currency: String) {
    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Money) {
            return false
        }
        return amount == other.amount && currency == other.currency
    }

    override fun hashCode(): Int {
        return amount
    }

    operator fun plus(added: Money): Money {
        return Money(amount + added.amount, currency);
    }

    operator fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }
}