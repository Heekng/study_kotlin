package com.heekng.kotlinStudy.kotlin.lec03

import com.heekng.kotlinStudy.java.lec03.Person

fun main() {

}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        // 스마트 캐스트
        // 이미 Person 타입인지 확이했기 때문에 바로 name 사용 가능
        println(obj.name)
    }
}