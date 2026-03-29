package org.example.lessons.lesson18.homework

class Oven : OpenableAndTemperatureRegulatableClass() {
    override val maxTemperature: Int = 300
    override fun open() {
        println("Открыть духовку")
    }

    override fun close() {
        println("Закрыть духовку")
    }

    override fun setTemperature(temp: Int) {
        powerOn()
        println("Установить температуру духовки $temp")
    }
    override fun powerOn(){
        println("Включить духовку")
    }
    override fun powerOff(){
        println("Выключить духовку")
    }


}