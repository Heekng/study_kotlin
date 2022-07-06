package com.heekng.kotlinStudy.kotlin.lec08

fun main() {
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    // *: spread 연산자
    // 배열 안에 있는 것들을 마치 그냥 , 을 쓰는 것처럼 꺼내준다.
    printAll(*array)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}