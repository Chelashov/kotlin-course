package org.example.lessons.lesson10.homework

fun main() {
    val m1 = mapOf<Int, Int>()
    val m2 = mapOf<Float, Double>(9.3000f to 2.33, 9f to 3.14)
    val m3 = mutableMapOf<Int, String>()
    m3[1] = "кот"
    m3[2] = "пёс"
    println(m3)
    println(m3[2])
    println(m3[3])
    m3.remove(1)
    val m7 = mapOf<Double, Int>(2.33 to 2, 3.0 to 4, 1.44 to 0)
    for ((i, j) in m7) {
        if (j == 0)
            println("бесконечность")
        else println(i / j)
    }
    m3[2] = "гусь"
    println(m3)
    val m91 = mapOf<Int, String>(1 to "лось", 2 to "тигр")
    val m92 = mapOf<Int, String>(3 to "лебедь", 4 to "орел")
    val m93 = mutableMapOf<Int, String>()
    for ((i, j) in m91) {
        m93[i] = j
    }
    for ((i, j) in m92) {
        m93[i] = j
    }
    println(m93)

    val m10 = mutableMapOf<String, List<Int>>()
    m10["Жора"] = listOf(2, 2, 3)
    m10["Гена"] = listOf(7, 6, 7)
    println(m10)

    val m11 = mutableMapOf<Int, MutableSet<String>>()
    m11[1] = mutableSetOf("вилка", "ложка")
    m11[2] = mutableSetOf("стол", "стул")
    println(m11[2])
    m11[2]?.add("табуретка")
    println(m11)

    val m12 = mapOf<Pair<Int, Int>, String>((1 to 2) to "епт", (9 to 5) to "ппц")
    for ((i, j) in m12) {
        if (i.first == 5 || i.second == 5) {
            println(m12[i])
        }
    }

    val library = mutableMapOf<String, MutableList<String>>()
    val plants = mapOf<String, MutableList<String>>()
    val teams = mapOf<String, List<String>>()
    val course = mutableMapOf<String, MutableList<String>>()
    val trips = mapOf<String, MutableMap<String, MutableList<String>>>()


}
