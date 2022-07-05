package com.heekng.kotlinStudy.kotlin.lec02

fun main() {

    var person = Person("heekng")

    // @Nullable 일 때 또는 관련 어노테이션이 없을 때에는 불가능
    // @NotNull 일 때에는 가능
    startsWithA(person.name)

}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}