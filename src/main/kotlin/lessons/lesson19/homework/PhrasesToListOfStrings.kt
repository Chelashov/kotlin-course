package org.example.lessons.lesson19.homework

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun convertList(list: List<String>): List<List<String>> {
        val res = list.map { it.split(" ") }
        return res
    }

    override fun convertElement(el: String): List<String> {
        val res = el.split(" ")
        return res
    }

}