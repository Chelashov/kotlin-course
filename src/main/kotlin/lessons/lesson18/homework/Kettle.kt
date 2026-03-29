package org.example.lessons.lesson18.homework

class Kettle : OpenableAndTemperatureRegulatableClass() {
    override val maxTemperature: Int = 100
    override fun open() {
        println("Открыть чайник")
    }

    override fun close() {
        println("Закрыть чайник")
    }

    override fun setTemperature(temp: Int) {
        powerOn()
        println("Установить температуру нагрева воды в чайнике $temp")
    }
    override fun powerOn(){
        println("Включить чайник")
    }
    override fun powerOff(){
        println("Выключить чайник")
    }

}