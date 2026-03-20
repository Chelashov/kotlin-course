package org.example.lessons.lesson15.homework

open class University (level: String, ageGroup: String, isFree: Boolean):
    LearningFacility (level = "High", ageGroup = "Adults", isFree) {
    fun startExams() = println("Начать экзамены")
}