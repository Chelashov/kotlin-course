package org.example.lessons.lesson29.homework

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

val backendTeamLeader = Employee(
    "Алексей", true, "22.04.1976", CharacterTypes.TEAM_LEAD,
    bitches = listOf(
        Employee(
            "Ольга", true, "16.12.1995", CharacterTypes.BACKEND_DEV,
            null
        ), Employee(
            "Сергей", true, "06.01.1982", CharacterTypes.SYSADMIN,
            null
        ), Employee(
            "Марина", false, "07.06.2003", CharacterTypes.QA,
            null
        )
    )
)

val frontendTeamLeader = Employee(
    "Артем", true, "22.04.1976", CharacterTypes.TEAM_LEAD,
    bitches = listOf(
        Employee(
            "Даниил", true, "16.12.1995", CharacterTypes.FRONTEND_DEV,
            null
        ), Employee(
            "Мария", true, "06.01.1982", CharacterTypes.UX_UI,
            null
        ), Employee(
            "Юлия", true, "07.06.2003", CharacterTypes.QA,
            null
        )
    )
)

val productManager = Employee(
    "Кирилл", true, "22.04.1976", CharacterTypes.PM,
    bitches = listOf(
        backendTeamLeader, frontendTeamLeader
    )
)

val CeXto = Employee(
    "Венеамин", true, "22.04.2016", CharacterTypes.CRM,
    null
)

val director = Employee(
    "Тывес", true, "08.09.1980", CharacterTypes.CTO,
    bitches = listOf(productManager, CeXto)
)

fun ex1(){
    val gson = GsonBuilder()
        .setPrettyPrinting() // Для красивого форматирования JSON
        .serializeNulls() // Включить null-поля в JSON
        .create()
    val json = gson.toJson(director)
    println("Pretty JSON:\n$json")
    val file = File("task3OfLesson29").writeText(json)
}

fun ex2(){
    val text = File("task3OfLesson29").readText()
    val gson = Gson()
    val employees = gson.fromJson(text, Employee::class.java) // Десериализация JSON в объект
    println("Сотрудники: $employees")
}

fun main() {
    ex1()
    ex2()
}