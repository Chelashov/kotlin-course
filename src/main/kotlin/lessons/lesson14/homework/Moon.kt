package org.example.lessons.lesson14.homework

object Moon {
    var isVisible = true
    var phase = "Full Moon"
    fun showPhase() { if (isVisible)
        println(phase)
        else println("Луна не видна")
    }
}

fun main() {
    Moon.showPhase()
}

