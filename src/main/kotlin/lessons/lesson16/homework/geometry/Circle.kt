package org.example.lessons.lesson16.homework.geometry

class Circle (val radius: Double) : Shape() {
    override fun area() : Double{
        val area = radius * radius * 3.14
        println(area)
        return area
    }
}