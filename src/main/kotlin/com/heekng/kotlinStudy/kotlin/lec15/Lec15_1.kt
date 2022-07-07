package com.heekng.kotlinStudy.kotlin.lec15

fun main() {

    // 배열 만들기
    val array = arrayOf(100, 200)

    // 값 넣기
    array.plus(300)

    // 인덱스로 반복
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    // 인덱스와 값 모두 가져오기
    for ((idx, value) in array.withIndex()) {
        println("$idx, $value")
    }

}