package com.heekng.kotlinStudy.kotlin.lec12

import com.heekng.kotlinStudy.java.lec12.Moveable

fun main() {
    moveSomething(object : Moveable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

private fun moveSomething(moveable: Moveable) {
    moveable.move()
    moveable.fly()
}