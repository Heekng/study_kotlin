package com.heekng.kotlinStudy.kotlin.lec09

class Person3(val name: String, var age: Int) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

}
