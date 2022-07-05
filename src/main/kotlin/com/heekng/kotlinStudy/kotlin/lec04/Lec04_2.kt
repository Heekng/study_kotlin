package com.heekng.kotlinStudy.kotlin.lec04

import com.heekng.kotlinStudy.java.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    // 값을 비교
    println(money1 == money2)
    // 주솟값을 비교
    println(money1 === money3)

}