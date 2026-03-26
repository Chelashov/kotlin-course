package org.example.lessons.lesson17.homework

class Automat(val color: String, val model: String) {

    private var isOn = false
    private var OSisIn = false
    private var istalledGames = mutableListOf<String>()
    private var hasJoystick = false
    private var balance = 0.0
    var owner = ""
    var supportNumber = ""
    private var seanseIsPayd = false
    var price = 0.0
    private var PIN = ""

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    private fun loadOS() {
        OSisIn = true
    }

    private fun turnOffOS() {
        OSisIn = false
    }

    fun showGames(): MutableList<String> {
        println(istalledGames)
        return istalledGames
    }

    fun startGame(game: String) {

    }

    fun payForSeanse(money: Double) {
        if (money >= price)
            seanseIsPayd = true
    }

    private fun withdrawMoney(PIN: String): Double {
        return if (this.PIN == PIN) {
            balance
        } else 0.0
    }
    private fun openSafe(key: String): Double{
        return balance
    }


}