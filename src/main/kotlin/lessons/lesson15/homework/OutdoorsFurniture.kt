package org.example.lessons.lesson15.homework

class OutdoorsFurniture(weigth: Int, color: String)
    : Furniture(weigth, color) {
    fun hideInGarage() = println("Спрятать в гараже")
}