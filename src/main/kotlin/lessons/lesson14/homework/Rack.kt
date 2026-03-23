//package org.example.lessons.lesson14.homework
//
//import kotlin.String
//
//class Rack(val shelves: MutableList<Shelf>, val maxShelves: Int) {
//
//    fun addShelf(shelf: Shelf): Boolean {
//        if (shelves.size + 1 <= maxShelves && !shelves.contains(shelf)) {
//            shelves.add(shelf)
//            return true
//        } else return false
//    }
//
//    fun removeShelf(i: Int): List<String> {
//        if (i in shelves.indices) {
//            shelves.removeAt(i)
//            val itemsOnShelf = shelves[i].getItems()
//            return itemsOnShelf
//        } else return listOf()
//    }
//
//    fun addItem(item: String): Boolean {
//        for (Shelf in shelves) {
//            if (Shelf.canAccommodate(item)) {
//                Shelf.addItem(item)
//                return true
//            }
//
//        }
//        return false
//    }
//
//    fun removeItem(item: String): Boolean {
//        for (Shelf in shelves) {
//            if (Shelf.containsItem(item)) {
//                Shelf.removeItem(item)
//                return true
//            }
//
//        }
//        return false
//    }
//
//    fun containsItem(item: String): Boolean {
//        for (Shelf in shelves) {
//            if (Shelf.containsItem(item)) {
//                return true
//            }
//
//        }
//        return false
//    }
//
//    fun getShelves() = shelves.toList()
//
//    fun printContents() {
//        for (i in shelves.indices) {
//            val capacity = shelves[i].capacity
//            val placeLeft = shelves[i].capacity - shelves[i].getItems().toString().trim().length
//            println(
//                "Полка $i вмещает $capacity. Осталось места $placeLeft. " +
//                        "Предметы на полке: ${shelves[i].getItems()}"
//            )
//
//        }
//    }
//}