package org.example.lessons.lesson12.homework

import kotlin.collections.listOf

fun main() {

    f25(grades)
    f27(list)
    f28(numbers28)
    f29(ages, age)


}

val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
val l = listOf(-1, 2, 3, 14, -5, 8, 264)

val t1 = numbers.size > 5
val t2 = numbers.isEmpty()
val t3 = numbers.isNotEmpty()
val t4 = numbers.getOrElse(7) { -1 }
val t5 = numbers.joinToString()
val t6 = numbers.sum()
val t7 = numbers.average()
val t8 = numbers.maxOrNull()
val t9 = numbers.minOrNull()
val t10 = numbers.firstOrNull()
val t11 = numbers.contains(2)

val t12 = numbers.filter { it in 18..30 }
val t13 = numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
val t14 = numbers.filterNotNull()
val t15 = numbers.map { it.toString().length }
val t16 = numbers.associate { it.toString().reversed() to it.toString().length }
val t17 = numbers.sorted()
val t18 = numbers.take(3)
val t19 = numbers.forEach { println(it*it) }
val t20 = numbers.groupBy { it.toString().substring(0, 1) }
val t21 = numbers.distinct()
val t22 = numbers.sortedDescending()
val t23 = numbers.takeLast(3)

fun f24(l: List<Int>): String {
    when {
        l.isEmpty() -> {
            return "Пусто"
        }

        l.size < 5 -> {
            return "Короткая"
        }

        l[0] == 0 -> {
            return "Стартовая"
        }

        l.sum() > 10000 -> {
            return "Массивная"
        }

        l.average().toInt() == 10 -> {
            return "Сбалансирвоанная"
        }

        l.joinToString().length == 20 -> {
            return "Клейкая"
        }

        l.max() < -10 -> {
            return "Отрицательная"
        }

        l.min() > 1000 -> {
            return "Положительная"
        }

        l.contains(3) && l.contains(14) -> {
            return "Пи***тая"
        }

        else -> return "Уникальная"
    }
}

val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

fun f25(grades: List<Int>): List<Int> {
    val result = grades.filter { it >= 60 }.sorted().take(3)
    println(result)
    return result

}

val list = listOf(
    "Стол",
    "табурет",
    "ваза",
    "Кружка",
    "Зеркало",
    "ковер",
    "Шкаф",
    "часы",
    "Люстра",
    "подушка",
    "Картина",
    "столик",
    "Вазон",
    "шторы",
    "Пуф",
    "книга",
    "Фоторамка",
    "светильник",
    "Коврик",
    "вешалка",
    "Подставка",
    "телевизор",
    "Комод",
    "полка",
    "Абажур",
    "диван",
    "Кресло",
    "занавеска",
    "Бра",
    "пепельница",
    "Глобус",
    "статуэтка",
    "Поднос",
    "фигурка",
    "Ключница",
    "плед",
    "Тумба",
    "игрушка",
    "Настенные часы",
    "подсвечник",
    "Журнальный столик",
    "сувенир",
    "Корзина для белья",
    "посуда",
    "Настольная лампа",
    "торшер",
    "Этажерка"
)

fun f26(list: List<String>): Map<Char, List<Int>> {
    val result26 = list.map { it.lowercase() }.groupBy { it.lowercase().substring(0, 1) }
    println(result26)
    return mapOf()
}

fun f27(list: List<String>): String {
    val result27 = list.map { it.length }.average()
    println(result27.toString().substring(0, 4))
    return result27.toString().substring(0, 4)
}

val numbers28 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

fun f28(numbers28: List<Int>): Map<String, List<Int>> {
    val result28 = numbers28.distinct().sortedDescending().groupBy { if (it % 2 == 0) "Четные" else "Нечетные" }
    println(result28)
    return result28
}

val ages = listOf(22, 18, 30, 45, 17, null, 60)
val age = 180

fun f29(ages: List<Int?>, age: Int): Int? {
    val result29 = ages.filterNotNull().firstOrNull { it > age }
    println(result29)
    return result29
}