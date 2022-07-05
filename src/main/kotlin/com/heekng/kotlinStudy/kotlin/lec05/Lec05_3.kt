package com.heekng.kotlinStudy.kotlin.lec05

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}