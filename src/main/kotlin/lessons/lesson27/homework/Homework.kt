package org.example.lessons.lesson27.homework

import org.example.lessons.lesson26.homework.ex2

fun main() {
    RealtyTypes.FLAT.printNames()
    bestPlanet { filerByWeight(Planets.PLUTO) }
    bestPlanet { filterByDistance(Planets.PLUTO) }
}

fun testResult(ex: () -> Unit): TestStatuses {
    return try {
        ex()
        TestStatuses.PASSED
    } catch (e: AssertionError) {
        TestStatuses.FAILED
    } catch (e: Throwable) {
        TestStatuses.BROKEN
    }
}

fun bestPlanet(ex: (Planets) -> List<Planets>): Planets {
    return ex(Planets.PLUTO).firstOrNull().also { println(it) } ?: throw RuntimeException("Планеты не найдено")

}

fun filterByDistance(Planet: Planets): List<Planets> {
    return Planets.entries.sortedBy { it.distanceToSun }
}

fun filerByWeight(Planet: Planets): List<Planets> {
    return Planets.entries.sortedBy { it.weight }
}

enum class TestStatuses {
    PASSED,
    BROKEN,
    FAILED
    ;

}

enum class RealtyTypes(val sitename: String) {
    FLAT("квартира"),
    HOUSE("дом"),
    TOWN_HOUSE("таунхаус"),
    ROOM("комната"),
    TRAILER("трейлер")
    ;

    fun printNames() {
        RealtyTypes.entries.sortedBy { it.name.length }.forEach { println(it.sitename) }
    }

}

enum class Planets(val planetname: String, var distanceToSun: Long, var weight: Long) {
    MERCURY("Мекркурий", 10, 10),
    VENUS("Венера", 2, 2),
    EARTH("Земля", 3, 3),
    MARS("Марс", 4, 4),
    JUPITER("Юпитер", 5, 5),
    SATURN("Сатурн", 6, 6),
    NEPTUN("Нептун", 7, 7),
    PLUTO("Плутон", 8, 8)
    ;

}

