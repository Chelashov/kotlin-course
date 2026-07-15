package org.example.lessons.lesson31.homework

class PhoneNumberFormatter {
    fun formatPhoneNumber(arg: String): String {
        val rawString = arg.replace(
            "\\D".toRegex(),
            replacement = ""
        )
        if (rawString.length !in 10..11) {
            throw IllegalArgumentException("Номер не валидный")
        }
        if (rawString.length == 11 && rawString.substring(0, 1).toInt() !in 7..8
        ) {
            throw IllegalArgumentException("Номер не валидный")
        }

        val digits = if (rawString.length == 11 && rawString.startsWith("7") || rawString.startsWith("8")) {
            rawString.substring(1)
        } else rawString


        val number = "+7 (${digits.substring(0, 3)}) ${digits.substring(3, 6)}-${
            digits.substring(6, 8)
        }-${digits.substring(8, 10)}"
        println(number)
        return number
    }
}

fun main() {
    val formatter = PhoneNumberFormatter()
    formatter.formatPhoneNumber("9885840306")
}