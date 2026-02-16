package org.example.lessons.lesson07.homework

 u
fun main() {

    for (i in 1..5) {
        println(i)
    }
    println()

    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }
    println()

    for (i in 5 downTo 1) {
        println(i)
    }
    println()

    for (i in 10 downTo 1) {
        println(i - 2)
    }
    println()

    for (i in 1..9 step 2) {
        println(i)
    }
    println()

    for (i in 1..20 step 3) {
        println(i)
    }
    println()

    val size = 11
    for (i in 3 until size step 2) {
        println(i)
    }
    println()

    var counter1 = 0
    while (counter1++ < 5) {
        println(counter1 * counter1)
    }
    println()

    var counter2 = 11
    while (counter2-- > 5) {
        println(counter2)
    }
    println()

    var counter3 = 5
    do {
        println(counter3)
    } while (counter3-- > 1)
    println()

    var counter4 = 5
    do {
        println(counter4)
    } while (counter4++ < 9)
    println()

    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
    println()

    var counter5 = 0
    while (counter5++ > -1) {
        if (counter5 == 10) break
        println(counter5)
    }
    println()

    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
    println()

    var counter6 = 0
    while (counter6++ < 10) {
        if (counter6 % 3 == 0) continue
        println(counter6)
    }
    println()
}