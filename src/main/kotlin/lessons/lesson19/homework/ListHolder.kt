package org.example.lessons.lesson19.homework

class ListHolder<T>(val list: MutableList<T>) {
    fun addElement(t: T){
        list.add(t)
    }
    fun getElements(): List<T> {
        return list
    }
}