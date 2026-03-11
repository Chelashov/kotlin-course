package org.example.lessons.lesson13.homework

fun main() {
    println(m11)
    m1["test5"] = 2.31
    println(m1)
    println(m41)
    println(m51)
    println(m6)
    m6.forEach { (key, value) -> println("$key : $value") }
    println(m71)
    println(m8)
    println(m9)
    println(m101)
    println(m13)
    println(m14)
    m5.putAll(mapOf("bug5" to "ToDo"))
    println(m5)
    println(m161)
    m17.clear()
    println(m17)
    println(m19)
    println(m20)
    println(m221)
    println(m23)

}

val m1 = mutableMapOf("test1" to 0.29, "test2" to 1.29, "test3" to 2.29, "test4" to 3.29)
val m11 = m1.values.average()

val m2 = mapOf("getValue" to "QQQQQQQ", "getBank" to "RRRRRR", "deleteNumber" to "111111")
val m21 = m2.keys

val m4 = mapOf("test1" to "passed", "test2" to "failed", "test3" to "skipped", "test4" to "passed")
val m41 = m4.count { it.value == "passed" }

val m5 = mutableMapOf("bug1" to "inProgress", "bug2" to "inProgress", "bug3" to "fixed", "bug4" to "fixed")
val m51 = m5.entries.removeIf { it.value == "fixed" }

val m6 = mapOf("URL1" to "OK", "URL2" to "OK", "URL3" to "FAILED")

val m7 = mapOf("sbp" to 0.45, "transfer" to 0.11, "banks" to 0.50)
val m71 = m7.filterValues { it <= 0.3 }

val m8 = m6.getOrDefault("URL5", "SKIPPED")

val m9 = m2.getOrElse("browserType") { "UNDEFINED" }

val m10 = mapOf("iOS" to "18.5", "android" to "15.0")
val m101 = m10 + ("ios" to 26)

val m12 = m7.containsKey("sbp")

val m13 = m6.filterKeys { it.endsWith("1") }

val m14 = m6.containsValue("FAILED")

val m16 = mapOf("bug1" to "inProgress", "bug2" to "inProgress", "bug3" to "fixed", "bug4" to "fixed")
val m161 = m16 + mapOf("bug5" to "ToDo")

val m17 = mutableMapOf("test1" to "passed", "test2" to "failed", "test3" to "skipped", "test4" to "passed")

val m18 = m17.filterNot { it.value == "skipped" }

val m19 = m10 - "iOS" - "ios"

val m20 = m17.map { "${it.key} : ${it.value}" }

val m210 = m17.toMap()

val m22 = mapOf(1 to 2.23, 2 to 3.56, 3 to 4.31)
val m221 = m22.mapKeys { it.key.toString() }

val m23 = m7.mapValues { it.value * 1.1 }

val m24 = m23.isEmpty()

val m25 = m23.isNotEmpty()

val m26 = m17.all { it.value == "passed" }

val m27 = m17.any { it.value == "failed" }

val m28 = m17.filter { it.key.endsWith("2") && it.value != "passed" }

