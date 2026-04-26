package org.example.lessons.lesson23.homework

fun f1(arg: List<Int>): Double {
    require(arg.isNotEmpty())
    val sum = arg.filter { it % 2 == 0 }
    return sum.average()
}

val f2 = fun(arg: List<Int>): Double {
    require(arg.isNotEmpty())
    val sum = arg.filter { it % 2 == 0 }
    return sum.average()
}

val f3: (List<Int>) -> Double = { arg ->
    require(arg.isNotEmpty())
    val sum = arg.filter { it % 2 == 0 }
    sum.average()
}

val f4 = { arg: List<Int> ->
    require(arg.isNotEmpty())
    val sum = arg.filter { it % 2 == 0 }
    println(sum.average())
    sum.average()
}

fun f5(arg: Int): Int {
    require(arg > 0)
    val sum = arg.toString().sumOf { it.digitToInt() }
    return sum
}

val f6 = fun(arg: Long): Int {
    require(arg > 0)
    val sum = arg.toString().sumOf { it.digitToInt() }
    return sum
}

val f7: (Long) -> Int = { arg ->
    require(arg > 0)
    val sum = arg.toString().sumOf { it.digitToInt() }
    sum
}

val f8 = { arg: Long ->
    require(arg > 0)
    val sum = arg.toString().sumOf { it.digitToInt() }
    println(sum)
    sum
}

fun List<Int>.f9(): Set<Int> {
    return this
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys
}

val f10 = fun List<Int>.(): Set<Int> {
    return this
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys
}

val f11: List<Int>.() -> Set<Int> = {
    this
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys
}

fun main() {
    f4(listOf(1, 2, 3, 4, 1, 5))
    f8(13242342777777734)
    println(listOf(1, 2, 3, 4, 1, 5, 4, 5, 6, 7, 7, 3, 3, 3).f11())
}

