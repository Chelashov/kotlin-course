package org.example.lessons.lesson18.homework

abstract class ProgrammableClass: PowerableClass(), Programmable  {
    override fun programAction(action: String) {
        println("Запрограммируй действие: $action")
    }

    override fun execute() {
        println("Выполни запрограммированное действие")
    }
}