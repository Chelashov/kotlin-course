package org.example.lessons.lesson15.homework

open class School (level: String, ageGroup: String, isFree: Boolean):
    LearningFacility (level = "Low", ageGroup = "Children", isFree) {
    fun fireFizruk() = println("Уволить физрука")
}