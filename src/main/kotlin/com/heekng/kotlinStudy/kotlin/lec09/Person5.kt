package com.heekng.kotlinStudy.kotlin.lec09

class Person5(val name: String, var age: Int) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    /*
    fun isAdult(): Boolean {
        return this.age >= 20
    }
     */

    /*
    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
     */

    val isAdult: Boolean
        get() = this.age >= 20
}
