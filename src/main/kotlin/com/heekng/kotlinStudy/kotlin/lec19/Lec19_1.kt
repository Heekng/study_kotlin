package com.heekng.kotlinStudy.kotlin.lec19

import com.heekng.kotlinStudy.java.lec17.Fruit

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

data class UltraSuperGuardianTribe(
        val name: String
)
