package com.heekng.kotlinStudy.kotlin.lec20

fun main() {
    val person = Person("heekng", 10)
    with(person) {
        println(name)
        println(this.age)
    }
}