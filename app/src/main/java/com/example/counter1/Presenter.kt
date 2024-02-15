package com.example.counter1


class Presenter(private val view: View) {
    private val model = Model()

    fun plus() {
        model.number++
        view.setNumber(model.number)
        compare()
    }

    fun minus() {
        model.number--
        view.setNumber(model.number)
        compare()
        model.checkNumber()
    }

    private fun compare() {
        when (model.number) {
            15 -> view.setColorGreen(model.number)
            14 -> view.setColorWhite(model.number)
        }
    }
}