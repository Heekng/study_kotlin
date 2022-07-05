package com.heekng.kotlinStudy.kotlin.lec04

data class Money (
        val amount: Long
){

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }

}