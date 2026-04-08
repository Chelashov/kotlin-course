package org.example.lessons.lesson20.homework

import kotlin.math.absoluteValue

fun Array<Int>.getPair() : Pair<Int?, Int?> {
    return if (isEmpty()) {
        null to null
    } else {
        first() to last()
    }
}

fun <T : Comparable<T>> MutableList<T>.getList(arg: Boolean) : List<T>{
    val list = toList()
    if (arg){
        sort()
    }
    else {
        sortDescending()
    }
    return list

}

fun <R> Map<R, List<R>>?.mapByIndex(index: Int): Map<String, R?>? {
    return this?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(index) }
}

fun Number.within (other: Number, deviation: Number): Boolean{
    if ((toDouble() - other.toDouble()).absoluteValue <= deviation.toDouble()) return true
    else return false
}

fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}
fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

fun String.twitterize(authors: List<String>) {
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}