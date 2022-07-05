package com.heekng.kotlinStudy.kotlin.lec04

import com.heekng.kotlinStudy.java.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // compareTo를 자동 호출한다.
    if (money1 > money2) {
        println("money1이 money2보다 금액이 큽니다.")
    }

}