package com.heekng.kotlinStudy.kotlin.lec03

fun main() {

    // nullable 의 경우에는 적절한 처리가 필요하다.
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
    
}