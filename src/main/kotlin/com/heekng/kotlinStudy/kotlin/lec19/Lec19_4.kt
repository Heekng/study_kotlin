package com.heekng.kotlinStudy.kotlin.lec19

fun main() {
    val person = Person2("heekng", 28)
    val (name, age) = person
    println("이름: ${name} 나이: ${age}")
}

class Person2(
        val name: String,
        val age: Int
) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }
}