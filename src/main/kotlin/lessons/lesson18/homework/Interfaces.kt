package org.example.lessons.lesson18.homework

import java.io.InputStream

interface Interfaces {
}
interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

fun main() {
    val fridge = Fridge()
    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.emitLight()
    fridge.open()
    fridge.completeLiteEmission()
    fridge.close()
    println()
    val washer = Washer()
    washer.connectToDrain()
    washer.connectToDrain()
    washer.setTemperature(40)
    washer.setTimer(60)
    washer.getWater(2)
    washer.drain()
    washer.powerOff()
    println()
    val kettle = Kettle()
    kettle.setTemperature(100)
    kettle.programAction("Кипячение")
    kettle.execute()
    println()
    val oven  = Oven()
    oven.setTemperature(250)
    oven.programAction("Запекание мяса")
    oven.execute()
    oven.powerOff()

}