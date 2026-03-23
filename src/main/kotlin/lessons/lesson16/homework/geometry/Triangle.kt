package org.example.lessons.lesson16.homework.geometry

class Triangle (val side1: Double, val side2: Double, val sinOfAngle: Double) : Shape() {
    override fun area(): Double {
        val area = 0.5 * side1 * side2 * sinOfAngle
        println(area)
        return area
    }
}

fun main() {
    val circle = Circle(30.0)
    val square = Square(22.3)
    val triangle = Triangle(15.0,10.0,0.7)
    val figures = listOf(circle, square, triangle)
    figures.forEach { figure -> figure.area() }

}