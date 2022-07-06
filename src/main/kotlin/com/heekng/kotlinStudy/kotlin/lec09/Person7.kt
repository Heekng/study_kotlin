package com.heekng.kotlinStudy.kotlin.lec09

class Person7(name: String = "heekng", var age: Int = 1) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    val isAdult: Boolean
        get() = this.age >= 20

}
