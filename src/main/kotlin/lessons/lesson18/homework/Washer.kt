package org.example.lessons.lesson18.homework

class Washer : WasherAbstract() {
    override fun open() {
        println("Открыть стиралку")
    }

    override fun close() {
        println("Закрыть стиралку")
    }

    override val maxTemperature: Int = 90

    override fun setTemperature(temp: Int) {
        powerOn()
        println("Установить температуру для стирки")
    }

    override fun connectToWaterSupply() {
        println("Подключить стиралку к водопроводу")
    }

    override fun getWater(amount: Int) {
        powerOn()
        println("Набрать воду для стирки")
    }

    override val sensorType: String = "Электронный"
    override val maxSensoredValue: Int = 100

    override fun startMonitoring() {
        powerOn()
        println("Начать мониторинг стиралки")
    }

    override fun connectToDrain() {
        println("Подключить стиралку к канажке")
    }

    override fun drain() {
        powerOn()
        println("Слить воду из стиралки")
    }

    override fun setTimer(time: Int) {
        powerOn()
        println("Установить таймер для стирки")
    }

}