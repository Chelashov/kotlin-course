package org.example.lessons.lesson18.homework

class Fridge: FridgeAbstract() {
    override fun open() {
        println("Открыть холодильник")
    }

    override fun close() {
        println("Закрыть холодильник")
    }

    override val maxTemperature: Int = 10

    override fun setTemperature(temp: Int) {
        powerOn()
        println("Установить температуру в холодильнике")
    }

    override fun emitLight() {
        powerOn()
        println("Включить свет в холодильнике")
    }

    override fun completeLiteEmission() {
        powerOn()
        println("Выключить свет в холодильнике")
    }

    override fun powerOn() {
        println("Включить холодильник")
    }

    override fun powerOff() {
        println("Выключить холодильник")
    }
}