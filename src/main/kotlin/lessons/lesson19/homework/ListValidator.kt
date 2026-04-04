package org.example.lessons.lesson19.homework

open class ListValidator<L : Number> : Validator<List<L?>> {
    override fun validate(element: List<L?>): Boolean {
        return element.all { it != null && it.toDouble() != 0.0 }
    }


}