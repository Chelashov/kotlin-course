package org.example.lessons.lesson15.homework

class Triangle : Polygon(numberOfTangles = 3) {
    fun calculateHeight() = println("Высота треугольника")

    fun main() {
        println(hasTangles)
    }
}


