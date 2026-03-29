package org.example.lessons.lesson18.homework

abstract class OpenableAndTemperatureRegulatableClass : ProgrammableClass(), Openable, TemperatureRegulatable {
    override fun open() {
        println("Открыть оборудование")
    }

    override fun close() {
        println("Закрыть оборудование")
    }

    override fun setTemperature(temp: Int) {
        println("Установить температуру $temp")
    }
}