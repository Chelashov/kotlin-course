package org.example.lessons.lesson15.homework

class KitchenTable(weigth: Int, color: String, zone: String) :
    InHouseFurniture(weigth, color, zone = "Кухня") {
    fun fillWithFood() = println("Накрыть стол")
}