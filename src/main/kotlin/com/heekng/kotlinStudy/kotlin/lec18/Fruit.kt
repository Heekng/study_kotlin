package com.heekng.kotlinStudy.kotlin.lec18

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


}

private fun filterFruits(
        fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}

//class Fruit(val id: Long, val name: String, val factoryPrice: Long, val currentPrice: Long)