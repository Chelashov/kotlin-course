package org.example.lessons.lesson14.homework

class Emotion (val type: String, var intensity:Int) {
    fun express () = println("Эмоция $type с итенсивностью: $intensity")
}

fun main() {
    val emotion = Emotion("Гнев", 5)
    emotion.express()
}