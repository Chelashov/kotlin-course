package org.example.lessons.lesson09.homework

fun main() {
    val ar1 = arrayOf(1, 2, 3, 4, 5)
    val ar2 = Array(10) { "" }
    val ar3 = Array<Double>(5) { 0.0 }
    for (i in ar3.indices) {
        ar3[i] = i.toDouble() * i
    }
    val ar4 = Array<Int>(5) { 0 }
    for (i in ar4.indices) {
        ar4[i] = i * 3
    }
    val ar5 = arrayOf<String?>(null, "", "")
    val ar61 = arrayOf(1, 2, 3, 4)
    val ar62 = Array(4) { 0 }
    for (i in ar61.indices) {
        ar62[i] = ar61[i]
    }
    val ar71 = arrayOf(1, 2, 3, 4)
    val ar72 = Array(4) { 1 }
    val ar73 = Array(4) { 0 }
    for (i in ar73.indices) {
        ar73[i] = ar72[i] - ar71[i]
        print(ar73.toList())
        println()
    }
    val ar8 = arrayOf(1, 2, 5, 4, 7)
    var i8 = 0
    var result8 = -1
    while (i8 in ar8.indices) {
        if (ar8[i8] == 5) {
            result8 = i8
            break
        }
        i8++
    }
    println(result8)

    val ar9 = arrayOf(1, 2, 3, 4, 5)
    var result = 0
    for (i9 in ar9.indices) {
        if (ar9[i9] % 2 == 0) {
            result = ar9[i9]
            println("$result - четное")
        } else if (ar9[i9] % 2 != 0) {
            result = ar9[i9]
            println("$result - нечетное")
        }

    }
    val arg1 = arrayOf("мяу", "пук-пук", "гав")
    val arg2 = "пук"
    f10(arg1, arg2)

    val l1 = listOf<Int>()
    val l2 = listOf<String>("Hello", "World", "Kotlin")
    val l3 = mutableListOf(1, 2, 3, 4, 5)
    l3.add(6)
    l3.add(7)
    l3.add(8)
    val l5 = mutableListOf("Hello", "World", "Kotlin")
    l5.remove("World")
    println(l5)
    val l6 = mutableListOf(1, 2, 3, 4, 5)
    for (i in l6.indices) {
        println(l6[i])
    }
    val l7 = mutableListOf("Hello", "World", "Kotlin")
    println(l7[1])
    val l8 = mutableListOf(1, 2, 3, 4, 5)
    l8[3] = 9
    println(l8)
    val l91 = mutableListOf("Hello", "World", "Kotlin")
    val l92 = mutableListOf("мяу", "пук-пук", "гав")
    var l93 = mutableListOf<String>()
    for (i in l91) {
        l93.add(i)
    }
    for (i in l92) {
        l93.add(i)
    }
    println(l93)
    val l10 = listOf(1, 2, 3, 4, 5, 6, -7, 8, 9, 10)
    var max = 0
    var min = 0
    for (i in l10) {
        if (i > max) {
            max = i
        }
        for (i in l10) {
            if (i < min) {
                min = i
            }
        }

    }
    println(max)
    println(min)

    val l11 = listOf(1, 2, 3, 4, 5, 6)
    var l11n = mutableListOf<Int>()
    for (i in l11) {
        if (i % 2 == 0) {
            l11n.add(i)
        }
    }
    println(l11n)

    val s1 = setOf<Int>()
    val s2 = setOf(1, 2, 3)
    val s3 = mutableSetOf<String>("Kotlin", "Java", "Scala")
    s3.add("Swift")
    s3.add("Go")
    val s5 = mutableSetOf<Int>(1, 2, 3)
    s5.remove(2)
    val s6 = setOf(1, 2, 3, 4, 5)
    for (i in s6) {
        println(i)
    }
    val s8 = mutableSetOf<String>("Kotlin", "Java", "Scala", "Swift", "Go")
    var s81 = mutableListOf<String>()
    for (i in s8) {
        s81.add(i)

    }
    println(s81)


}

fun f10(arg1: Array<String>, arg2: String) {
    for (i10 in arg1) {
        if (i10.contains(arg2)) {
            println(i10)
        }
    }
}

fun s7(arg1: Set<String>, arg2: String) {
    for (i in arg1) {
        if (i.contains(arg2)) {
            println(i)
        }
    }
}