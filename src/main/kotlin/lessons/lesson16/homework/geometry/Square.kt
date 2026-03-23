package org.example.lessons.lesson16.homework.geometry

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        val area = side * side
        println(area)
        return area
    }
}