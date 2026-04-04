package org.example.lessons.lesson19.homework



fun main() {
    val list = ListValidator<Int>()
    val l = list.validate(listOf(1,null,3))
    println(l)

    val list1 = listOf(1,2,3,4)
    val el = getMiddleElement(list1)
    println(el)
}

fun <G> getMiddleElement(list: List<G?>): G? {
    val element = list[list.size / 2]
    if (list.size %2 == 0)
        return null
    else
        return element
}

fun <K, V> transposition (map: Map<K, V>): Map<V, K> {
    return map.map { it }.associate { it.value to it.key }
}
