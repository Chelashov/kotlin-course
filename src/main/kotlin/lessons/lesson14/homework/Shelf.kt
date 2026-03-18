package org.example.lessons.lesson14.homework

class Shelf(val capacity: Int, val items: MutableList<String>) {

    fun addItem(item: String): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            return true
        } else return false
    }

    fun removeItem(item: String): Boolean {
        if (items.contains(item)) {
            items.remove(item)
            return true
        } else return false
    }

    fun canAccommodate(item: String): Boolean {
        val itemsLegth = items.toString().trim().length
        if (item.length + itemsLegth <= capacity) {
            return true
        } else return false
    }

    fun containsItem(item: String): Boolean {
        if (items.contains(item)) {
            return true
        } else return false
    }

    fun getItems() = items.toList()
}
