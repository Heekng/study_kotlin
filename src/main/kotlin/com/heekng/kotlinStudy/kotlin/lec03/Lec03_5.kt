package com.heekng.kotlinStudy.kotlin.lec03

import com.heekng.kotlinStudy.java.lec03.Person

fun main() {
    val person = Person("heekng")
    val name = person.name

    println("이름: ${person.name}")
    println("이름: $name")

    // 여러 줄의 문자열
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    // 특정 문자 가져오기
    val str2 = "ABC"
    println(str2[0])
    println(str2[2])
}

