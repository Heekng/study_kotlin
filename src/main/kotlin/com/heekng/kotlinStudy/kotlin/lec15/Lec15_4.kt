package com.heekng.kotlinStudy.kotlin.lec15

fun main() {

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // 사용하기

    for (key in oldMap.keys) {
        println(key)
        println(oldMap.get(key))
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

}
