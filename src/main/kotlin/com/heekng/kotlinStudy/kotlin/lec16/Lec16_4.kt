package com.heekng.kotlinStudy.kotlin.lec16

fun main() {
}

fun createPerson(firstName: String, lastName: String): Person {
    /*
    if (firstName.isEmpty()) {
        throw IllegalArgumentException("firstName은 비어있을 수 없습니다. 현재 값: ${firstName}")
    }

    if (lastName.isEmpty()) {
        throw IllegalArgumentException("lastName은 비어있을 수 없습니다. 현재 값: ${lastName}")
    }
     */

    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. 현재 값: ${name}")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName)
}