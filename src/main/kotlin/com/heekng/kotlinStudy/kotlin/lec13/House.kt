package com.heekng.kotlinStudy.kotlin.lec13

fun main() {

}

class House(
        private val address: String,
        private val livingRoom: LivingRoom
) {
    class LivingRoom(
            private val area: Double
    )
}

class House2(
        private val address: String,
        private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
            private val area: Double
    ) {
        val address: String
            get() = this@House2.address
    }
}