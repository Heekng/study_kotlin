package com.heekng.kotlinStudy.kotlin.lec02

fun main() {
    println(startsWith(null))
}

fun startsWithA1(str: String?): Boolean {
    /*
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
     */

    return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    /*
    if (str == null) {
        return null
    }
    return str.startsWith("A")
     */

    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    /*
    if (str == null) {
        return false
    }
    return str.startsWith("A")
    */

    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}