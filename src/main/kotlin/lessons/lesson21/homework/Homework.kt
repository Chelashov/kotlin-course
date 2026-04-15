package org.example.lessons.lesson21.homework

fun analyzeDataType(arg: Any) {
    when (arg) {
        is String -> println("Это строка: $arg")
        is Number -> println("Это число: $arg")
        is List<*> -> println("Это список, количество элементов: ${arg.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${arg.size}")
        else -> println("Неизвестный тип данных")
    }
}

fun safeCastToList(arg: Any): Int{
    return (arg as? List<*>)?.size ?: -1
}

fun getStringLengthOrZero(arg: Any?): Int{
    return (arg as? String)?.length ?: 0
}

fun Any.toSquare() : Number?{
    return (this as? Number)?.toDouble()?.times(2)
}

fun sumIntOrDoubleValues(arg: List<Any?>?): Double{
    var sum = 0.0
    if (arg != null) {
        for (it in arg){
            if (it is Int || it is Double)
                sum += (it.toDouble())
        }
    }
    return sum
}

fun tryCastToListAndPrint (arg: Any){
    (arg as? List<*>)?.forEach { println((it as? String) ?: ("Элемент не является строкой") ) }
        ?: println("Сообщение об ошибке")
}


fun main() {
    val list = listOf(1, "2.2", 3.3f)
    println(sumIntOrDoubleValues(list))
    val u = Unit

    tryCastToListAndPrint(list)
}

