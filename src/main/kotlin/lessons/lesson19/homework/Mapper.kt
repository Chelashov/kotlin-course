package org.example.lessons.lesson19.homework

interface Mapper<G,K> {
    fun convertList(list: List<G>): List<K>
    fun convertElement(el : G) : K
}