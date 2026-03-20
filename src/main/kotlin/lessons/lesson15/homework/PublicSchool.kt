package org.example.lessons.lesson15.homework

class PublicSchool(level: String, ageGroup: String, isFree: Boolean) :
    School(level = "Low", ageGroup = "Children", isFree = false) {
    fun collectMoneyFromParents() = println("Собрать деньги с родителей")
}