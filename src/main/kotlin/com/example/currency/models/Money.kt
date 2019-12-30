package com.example.currency.models

open class Money(open val amount: Int) {
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
}