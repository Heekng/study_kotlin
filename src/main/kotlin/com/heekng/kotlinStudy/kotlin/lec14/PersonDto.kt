package com.heekng.kotlinStudy.kotlin.lec14

fun main() {
    val personDto1 = PersonDto("heekng1", 28)
    val personDto2 = PersonDto("heekng2", 128)

    println(personDto1 == personDto2)
    println(personDto1)
}

data class PersonDto(
        val name: String,
        val age: Int
)