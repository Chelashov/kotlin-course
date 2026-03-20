package org.example.lessons.lesson15.homework

open class College(level: String, ageGroup: String, isFree: Boolean) :
    LearningFacility(level = "Middle", ageGroup = "Teens", isFree) {
    fun searchDrugs() = println("Искать наркотики")
}