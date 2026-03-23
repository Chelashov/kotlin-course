package org.example.lessons.lesson16.homework

class Logger {
    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(level: String, message: String) {
        if (level == "WARNING")
            printColored1("$level: $message", Colors1.YELLOW, Background1.BLACK)
        else if (level == "ERROR")
            printColored1("$level: $message", Colors1.WHITE, Background1.RED)
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            println("INFO: $message")
        }
    }

    fun log(exc: Exception) {
        println("INFO: $exc")
    }

}

fun main() {
    val logger = Logger()
    logger.log(Exception.exc1)
}

object Exception {
    val exc1 = "Твой код гавно"
    val exc2 = "Тебе пора отдохнуть"
}

object Colors1 {
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

object Background1 {
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

fun printColored1(text: String, color: String, backgroundColor: String) {
    println("$color$backgroundColor$text${Colors1.RESET}")
}