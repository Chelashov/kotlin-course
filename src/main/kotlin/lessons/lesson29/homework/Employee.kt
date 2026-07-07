package org.example.lessons.lesson29.homework

data class Employee(
    val name: String,
    val isEmployed: Boolean,
    val dateOfBirth: String,
    val position: CharacterTypes,
    val bitches: List<Employee>?
)
