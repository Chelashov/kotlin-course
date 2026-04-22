package org.example.lessons.lesson22.homework

import kotlin.math.PI

//NullPointerException
fun NPE() {
    val e1 = null
    val e2 = e1 as Int
}

//IndexOutOfBoundsException
fun IOBE() {
    val e1 = listOf(1, 3)
    e1[3]
}

//ClassCastException
fun CCE() {
    val e1 = "qq"
    val e2 = e1 as Int
}

//IllegalArgumentException
fun IAE(arg1: Int) {
    require(arg1 >= 0)
}

//NumberFormatException
fun NFE() {
    val e1 = "ddd"
    val e2 = e1.toInt()
}

//IllegalStateException
fun ISE(arg1: Boolean) {
    check(arg1)
}

//OutOfMemoryError
fun OME() {
    val e1 = mutableListOf(1.0)
    while (true) {
        e1.add(PI)
    }

}

//StackOverflowError
fun SOFE() {
    SOFE()
}

//fun f10(arg: Any?) {
//    when (arg) {
//        null -> arg as Int
//        is List<*> -> arg[99]
//        is Set<*> -> arg as Int
//        is Int -> require(arg > 0)
//        is String -> arg.toInt()
//        is Boolean -> check(arg)
//    }
//}
fun f10(arg: Any?) {
    try {
        when (arg) {
            null -> arg as Int
            is List<*> -> arg [99]
            is Set<*> -> arg as Int
            is Int -> require (arg > 0)
            is String -> arg.toInt()
            is Boolean -> check(arg)
        }


    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> {
                println("Обработано исключение типа NullPointerException")
            }

            is IndexOutOfBoundsException -> {
                println("Обработано исключение типа IndexOutOfBoundsException")
            }

            is ClassCastException ->
                println("Обработано исключение типа ClassCastException")

            is IllegalArgumentException -> {
                println("Обработано исключение типа IllegalArgumentException")
            }

            is NumberFormatException -> {
                println("Обработано исключение типа NumberFormatException")
            }

            is IllegalStateException ->{
                println("Обработано исключение типа IllegalStateException")
            }

        }
        throw e

    }
    println("Переданный аргумент фантастически хорош!")
}

fun main() {
    f10(1)

//    throw MyException("Моё исключение - моя прелесть")

    try {
        IOBE()
    }
    catch (e: IndexOutOfBoundsException) {
        println("Это моё исключение!")
        throw MyException2(e)
    }

//    try {
//        NPE()
//        IOBE()
//        CCE()
//        IAE(-1)
//        NFE()
//        ISE(false)
//        OME()
//        SOFE()
//    } catch (e: NullPointerException) {
//        println("NPE")
//    } catch (e: IndexOutOfBoundsException) {
//        println("IOBE")
//    } catch (e: ClassCastException) {
//        println("CCE")
//    } catch (e: IllegalArgumentException) {
//        println("IAE")
//    } catch (e: NumberFormatException) {
//        println("NFE")
//    } catch (e: IllegalStateException) {
//        println("ISE")
//    } catch (e: OutOfMemoryError) {
//        println("OME")
//    } catch (e: StackOverflowError) {
//        println("SOFE")
//    }
}