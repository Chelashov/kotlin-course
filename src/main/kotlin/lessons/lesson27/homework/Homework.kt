package org.example.lessons.lesson27.homework


fun main() {
    RealtyTypes.FLAT.printNames()
    bestPlanet { it.distanceToSun > 3 }
    bestPlanet { it.weight > 5 }
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

fun bestPlanet(ex: (Planets) -> Boolean): Planets {
    return Planets.entries.firstOrNull(ex).also { println(it) } ?: throw RuntimeException("Планеты не найдено")

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
        entries.sortedBy { it.name.length }.forEach { println(it.sitename) }
    }

}

enum class Planets(val planetname: String, var distanceToSun: Long, var weight: Long) {
    MERCURY("Мекркурий", 1, 1),
    VENUS("Венера", 2, 2),
    EARTH("Земля", 3, 3),
    MARS("Марс", 4, 4),
    JUPITER("Юпитер", 5, 5),
    SATURN("Сатурн", 6, 6),
    NEPTUN("Нептун", 7, 7),
    PLUTO("Плутон", 8, 8)
    ;

}

