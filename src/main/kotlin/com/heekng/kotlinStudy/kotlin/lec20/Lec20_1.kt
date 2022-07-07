package com.heekng.kotlinStudy.kotlin.lec20

fun main() {
}

fun printPerson1(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPerson2(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

data class Person(
        val name: String,
        val age: Int
)