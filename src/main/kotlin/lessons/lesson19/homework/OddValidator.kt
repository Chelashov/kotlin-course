package org.example.lessons.lesson19.homework

class OddValidator : Validator<Int> {
    override fun validate(element: Int): Boolean {
        return element % 2 == 0
    }

}