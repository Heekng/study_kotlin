package com.heekng.kotlinStudy.kotlin.lec03

import com.heekng.kotlinStudy.java.lec03.Person

fun main() {
    printAgeIfPersonNullable(null)
}

fun printAgeIfPersonNullable(obj: Any?) {
    val person = obj as? Person
    println(person?.name)
}