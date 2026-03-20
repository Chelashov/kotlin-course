package org.example.lessons.lesson15.homework

abstract class LearningFacility (val level: String,
                                 val ageGroup: String,
                                 val isFree: Boolean) {
    fun hireStaff() = println("Нанять сотрудников")
    fun getFinancing() = println("Получить финансирование")
}