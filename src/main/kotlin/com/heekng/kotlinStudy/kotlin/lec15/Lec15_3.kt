package com.heekng.kotlinStudy.kotlin.lec15

fun main() {

    // 불변 Set
    val numbers = setOf(100, 200)
    // 비어있는 Set
    val emptySet = emptySet<Int>()
    // 가변 Set
    val numbers2 = mutableSetOf(100, 200)

    // foreach
    for (number in numbers) {
        println(number)
    }

    // 인덱스와 함께 가져오기
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}
