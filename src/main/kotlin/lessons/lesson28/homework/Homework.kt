package org.example.lessons.lesson28.homework

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.Period
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

val currentTime = Instant.now()
val myBirrthday = LocalDate.of(1993, 6, 7)
val today = LocalDate.of(2026, 7, 6)
val period = Period.between(myBirrthday, today)

fun printFormatted(arg: Temporal) {
    when (arg) {
        is LocalDate -> "dd-MM-YYYY"
        is LocalTime -> "HH:mm:ss"
        is LocalDateTime -> "dd-MM-YYYY HH:mm:ss"
        is ZonedDateTime -> "dd-MM-YYYY HH:mm:ss z"
        is OffsetDateTime -> "dd-MM-YYYY HH:mm:ss ZZZ"
        else -> throw IllegalArgumentException("Неизвестный тип данных")
    }.let {
        DateTimeFormatter.ofPattern(it).format(arg)
    }.also { println(it) }
}

val startOfBoomers = LocalDate.of(1946, 1, 1)
val endOfBoomers = LocalDate.of(1964, 12, 31)
val startOfZoomers = LocalDate.of(1997, 1, 1)
val endOfZoomers = LocalDate.of(2012, 12, 31)

fun LocalDate.identifyGeneration() {
    println(
        when (this) {
            in startOfBoomers..endOfBoomers -> "Бумер"
            in startOfZoomers..endOfZoomers -> "Зумер"
//            isAfter(startOfBoomers) && isBefore(endOfBoomers) -> "Бумер"
//            isAfter(startOfZoomers) && isBefore(endOfZoomers) -> "Зумер"
            else -> "Не определено"
        }
    )
}

val formatter = DateTimeFormatter.ofPattern("MM-dd")
val date1 = LocalDate.of(2023, 2, 25)
val date2 = LocalDate.of(2024, 2, 25)

fun main() {
    println(currentTime)
    println(myBirrthday)
    println(period.years)
    printFormatted(myBirrthday)
    myBirrthday.plusYears(5).identifyGeneration()
    println(date1.plusDays(10).format(formatter))
    println(date2.plusDays(10).format(formatter))
}