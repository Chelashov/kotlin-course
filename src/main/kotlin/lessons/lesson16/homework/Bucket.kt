package org.example.lessons.lesson16.homework

class Bucket {
    val items = mutableMapOf<Int, Int>(1 to 3, 2 to 4, 3 to 5, 4 to 6)
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(newItems: Map<Int, Int>) {
        for ((id, qty) in newItems) {
            items[id] = items.getOrDefault(id, 0) + qty
        }
    }

    fun addToCart(ids: List<Int>) {
        for (id in ids) {
            items[id] = items.getOrDefault(id, 0) + 1
        }
    }

    fun toString(items: Map<Int, Int>): String {
        val ids = items.keys.size
        val sum = items.values.sum()
        return "$items Общее число позиций: $ids Общее количество предметов: $sum"
    }
}

fun main() {
    val bucket = Bucket()
    bucket.addToCart(6)
    println(bucket.items)
    bucket.addToCart(mapOf(6 to 3, 7 to 2, 8 to 1))
    println(bucket.items)
    bucket.addToCart(listOf(1, 9, 10))
    println(bucket.items)
    val newBucket = bucket.toString(bucket.items)
    println(newBucket)

}

