package com.heekng.kotlinStudy.kotlin.lec15

import java.util.*

fun main() {

    // 불변 리스트
    val numbers = listOf(100, 200)
    // 비어있는 리스트
    val emptyList = emptyList<Int>()
    // 가변 리스트
    val numbers2 = mutableListOf(100, 200)

    // 하나만 가져오기
    println(numbers[0])

    // foreach
    for (number in numbers) {
        println(number)
    }

    // 인덱스와 함께 가져오기
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}
