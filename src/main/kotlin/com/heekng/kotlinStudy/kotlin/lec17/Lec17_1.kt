package com.heekng.kotlinStudy.kotlin.lec17

import com.heekng.kotlinStudy.java.lec17.Fruit

fun main() {
    val fruits = listOf(
            Fruit("사과", 1_000),
            Fruit("사과", 2_000),
            Fruit("사과", 1_200),
            Fruit("사과", 1_500),
            Fruit("바나나", 3_000),
            Fruit("바나나", 3_200),
            Fruit("바나나", 2_500),
            Fruit("사과", 10_000)
    )

    // 람다를 만드는 방법 1
    /*
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
     */
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    // 람다를 직접 호출하는 방법 1
    isApple(fruits[0])

    // 람다를 직접 호출하는 방법 2
    isApple.invoke(fruits[0])


    filterFruits(fruits, isApple)
    // 가장 마지막 파라미터에 함수 있다면 중괄호에 입력할 수 있다.
    // 어떤 타입의 객체가 들어올 지 알기 때문에 클래스를 제외할 수 있다.
    filterFruits(fruits) {fruit -> fruit.name == "사과"}
    // 파라미터가 하나일 경우 it을 사용하면 해당 값을 바로 사용하게 된다.
    filterFruits(fruits) {it.name == "사과"}

}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}
