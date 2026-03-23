package org.example.lessons.lesson16.homework.printer

import org.example.lessons.lesson16.homework.animals.printColored

class Laser : Printer() {
    override fun printing(text: String) {
        val textL = text.split(" ")
        textL.forEach { textL -> printColored(textL, Colors.BLACK, Background.WHITE) }
    }
}

fun main() {
    val laser = Laser()
    laser.printing(
        "У Попа была собака\n" +
                "Он ее-ё-о любиил.\n" +
                "Она съела кусок мя-аса\n" +
                "Он ее-ё-о у-убил, убииил."
    )
}

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun printColored(text: String, color: Colors, backgroundColor: Background) {
    println("$color$backgroundColor$text${Colors.RESET}")
}