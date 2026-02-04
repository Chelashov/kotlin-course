package org.example.lessons.lesson06.homework

val month = 13
val age = 3.0
val distance = 5
val spendings = 3001.66
val type = ".jpg"
val arg1 = 36
val arg2 = 'C'
val temp = 40
val age2 = 18

fun main() {
    defineSeason(month)
    calculateDogAge(age)
    bestTransportaion(distance)
    calculateBonuses(spendings)
    defineDocType(type)
    convertDegrees(arg1, arg2)
    reccomendClothes(temp)
    showAvailableFilms(age2)
}

fun defineSeason(month: Int) {
    when (month) {
        in 1..2, 12 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        else -> println("Некорректно задан месяц")
    }
}

fun calculateDogAge(age: Double) {
    when (age) {
        in 0.0..2.0 -> println(age * 10.5)
        in 3.0..50.0 -> println(21 + (age - 2) * 4)
        else -> println("Некорректно задан возраст")
    }
}

fun bestTransportaion(distance: Int) {
    when (distance) {
        in 0 until 1 -> println("Пешком")
        in 1 until 5 -> println("Велосипед")
        else -> println("Автотранспорт")
    }
}

fun calculateBonuses(spendings: Double) {
    when (spendings) {
        in 0.0..99.99 -> println("Шиш вам, а не бонусы")
        in 100.0..1000.0 -> println(((spendings - spendings % 100) / 100 * 2))
        else -> println(((spendings - spendings % 100) / 100 * 3))
    }
}

fun defineDocType(type: String) {
    when (type) {
        in ".txt", ".rtf", ".doc", ".docx", ".odt" -> println("Текстовый документ")
        in ".jpg", ".jpeg", ".png", ".gif", ".tiff" -> println("Изображение")
        in ".xlsx", ".xls", ".ods", ".ots" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

fun convertDegrees(arg1: Int, arg2: Char) {
    when (arg2) {
        'C' -> println(arg1 * 9 / 5 + 32) //print ("C")
        'F' -> println(arg1 * 5 / 9 - 32) //print ("F")

    }
}

fun reccomendClothes(temp: Int) {
    when (temp) {
        in -30 until 10 -> println("куртка и шапка")
        in 10..18 -> println("толстовка")
        in 19..35 -> println("футболка и шорты")
        else -> println("сиди дома, епта")
    }
}

fun showAvailableFilms(age2: Int) {
    when (age2) {
        in 0..9 -> println("детские")
        in 10..17 -> println("детские, подростковые")
        else -> println("детские, подростковые, 18+")
    }
}
