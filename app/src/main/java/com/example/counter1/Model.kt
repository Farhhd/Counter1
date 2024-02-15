package com.example.counter1

class Model {
    var number: Int = 0
    fun checkNumber() {
        if (number < 0) {
            number = 1
        }
    }
}