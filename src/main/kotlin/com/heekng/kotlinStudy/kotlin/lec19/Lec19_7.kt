package com.heekng.kotlinStudy.kotlin.lec19

// default
fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// takeIf
fun getNumberOrNullTakeIf(number: Int): Int? {
    return number.takeIf { it > 0 }
}

// takeUnless
fun getNumberOrNullTakeUnless(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}