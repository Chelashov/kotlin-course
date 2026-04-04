package org.example.lessons.lesson19.homework

interface Validator <G> {
    fun validate(element: G): Boolean

}