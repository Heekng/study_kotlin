package com.heekng.kotlinStudy.kotlin.lec11

class Car(
        internal var name: String,
        private var owner: String,
        _price: Int
) {
    var price = _price
        private set
}