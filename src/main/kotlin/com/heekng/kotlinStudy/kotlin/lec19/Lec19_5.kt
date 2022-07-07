package com.heekng.kotlinStudy.kotlin.lec19

fun main() {

    val numbers = listOf(1, 2, 3)

    numbers.map { it + 1 }
            .forEach {println(it)}

    numbers.forEach {number ->
        if (number == 2) {
            return@forEach
        }
    }
}