package org.example.lessons.lesson18.homework

abstract class PowerableClass : Powerable{
    override fun powerOn(){
        println("Включить оборудование")
    }
    override fun powerOff(){
        println("Выключить оборудование")
    }
}