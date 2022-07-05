package com.heekng.kotlinStudy.kotlin.lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 의 범위는 0부터 100입니다.")
    }
}

fun validateScore(score: Int) {
    if (score in 0..100) {
        ;
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "F"
    }
}

