package com.heekng.kotlinStudy.kotlin.lec09

import com.heekng.kotlinStudy.java.lec09.JavaPerson

fun main() {
    val person = Person2("heekng", 123)
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person2(val name: String, var age: Int)
