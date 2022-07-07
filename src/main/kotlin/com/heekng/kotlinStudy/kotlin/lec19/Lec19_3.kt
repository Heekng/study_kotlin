package com.heekng.kotlinStudy.kotlin.lec19

fun main() {
    val person = Person("heekng", 28)
    val (name, age) = person
    /*
    // 동일하다.
    val name = person.component1()
    val age = person.component2()
     */
    println("이름: ${name} 나이: ${age}")
}

data class Person(
        val name: String,
        val age: Int
)