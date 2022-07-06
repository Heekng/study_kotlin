package com.heekng.kotlinStudy.kotlin.lec10

class Cat(species: String) : Animal(species, 4) {

    override fun move() {
        println("고양이가 걷는다.")
    }

}