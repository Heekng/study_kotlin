package com.heekng.kotlinStudy.kotlin.lec01

fun main() {

    var number1 = 10L
    // Null can not be a value of a non-null type Long, null이 불가능하다.
//    number1 = null

    var number2: Long? = 10L
    number2 = null
}