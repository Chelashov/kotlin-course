package org.example.lessons.lesson15.homework

class Triangle (hasTangles: Boolean) : Polygon(numberOfTangles = 3) {
    fun calculateHeight() = println("Высота треугольника")

    fun main() {
        println(hasTangles)
    }
}


