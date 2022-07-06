package com.heekng.kotlinStudy.kotlin.lec08

fun main() {
    repeat("Hello world", useNewLine = false)
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}