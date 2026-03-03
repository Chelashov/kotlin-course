package org.example.lessons.lesson11.homework

fun main() {
    val n = 10
    printNumbersUntil(n)
}

fun f1() {}
fun f2(a: Int, b: Int): Int {
    return a + b
}

fun f3(c: String) {}
fun f4(d: List<Int>): Double {
    return d.sum().toDouble() / d.size
}

private fun f5(e: String?): Int? {
    return e?.length
}

fun f6(): Float? {
    return 2.03F
}

private fun f7(d: List<Int>?) {}
fun f8(g: Int): String? {
    return null
}

fun f9(): List<String>? {
    return null
}

fun f10(g: String?, h: Int?): Boolean? {
    return false
}

fun multiplyByTwo(j: Int): Int {
    return j * 2
}

fun isEven(i: Int): Boolean {
    if (i % 2 == 0)
        return true
    else return false
}

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        print("$i ")
    }
}

fun findFirstNegative(l: List<Int>): Int? {
    for (i in l) {
        if (i < 0) {
            return i
        }
    }
    return null
}

fun processList(l1: List<String?>) {
    for (i in l1) {
        if (i == null)
            return
        else println(i)
    }
}


