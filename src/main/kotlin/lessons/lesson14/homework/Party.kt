package org.example.lessons.lesson14.homework

class Party(var location: String, var attendees: Int) {
    fun details() = println("Место проведения: $location, количество гостей: $attendees")
}

fun main() {
    val party = Party("Табачка", 50)
    party.details()
}