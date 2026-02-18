package org.example.lessons.lesson08.homework

fun main() {
    val arg = "Удача"
    changeString(arg)
    val arg1 = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    getDateAndTime(arg1)
    val arg2 = "4539 1488 0343 6467"
    maskCardNumber(arg2)
    val arg3 = "username@example.com"
    emailConvert(arg3)
    val arg4 = "C:/Пользователи/Документы/report.txt"
    extractFileName(arg4)
    val arg5 = "Котлин лучший язык программирования"
    createAbv(arg5)
}

fun changeString(arg: String) {
    val result = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> "$arg, но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")
        " " !in arg -> "Иногда, $arg, но не всегда"
        else -> arg
    }
    println(result)
}

fun getDateAndTime(arg1: String) {

    val indexOfChar = arg1.indexOf('>')
    val dateAndTime = arg1.substring(indexOfChar + 1)
    val date = dateAndTime.trim().substring(0, 11)
    val time = dateAndTime.trim().substring(11)
    println(date)
    println(time)
}

fun maskCardNumber(arg2: String) {
    val reversedString = arg2.reversed()
    val indexOfaChar = reversedString.indexOf(' ')
    val reversedDitits = reversedString.substring(0, indexOfaChar)
    val digits = reversedDitits.reversed()
    val result = "**** **** ***** $digits"
    println(result)
}

fun emailConvert(arg3: String) {
    val argWithReplacedDog = arg3.replace("@", " [at] ")
    val result = argWithReplacedDog.replace(".", " [dot] ")
    println(result)
}

fun extractFileName(arg4: String) {
    val reversedString = arg4.reversed()
    val indexOfaChar = reversedString.indexOf('/')
    val reversedFileName = reversedString.substring(0, indexOfaChar)
    val result = reversedFileName.reversed()
    println(result)
}


fun createAbv(arg5: String) {
    val words = arg5.split(' ')
    var j = 0
    for (i in words) {
        var abv = words[j++].substring(0, 1).uppercase()
        print(abv)
    }
}