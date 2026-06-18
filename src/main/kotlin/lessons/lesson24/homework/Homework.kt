package org.example.lessons.lesson24.homework

fun ex1(arg: Boolean, fnc: (String) -> Unit): Int {
    return 1
}

fun Int.ex2(fnc: Int.(String) -> List<String>): List<String> {
    return fnc(this.toString())
}

fun <T, K> T.ex3(fnc: T.() -> K): K {
    return fnc()
}

fun ex4(arg: String): () -> String {
    return { arg }
}

fun <G> G.ex5(): (String) -> G {
    return {this}
}

object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

fun String.colorize(color: String): String {
    val res = "$color$this${Colors.RESET}"
    println(res)
    return res
}

fun String.colorizeWords (fnc: (String) -> String) {
    val res = this.split(" ").forEach { fnc(it) }
}

fun fn1 (arg: String): String{
    return when {
        arg[0].uppercase()[0] == arg[0] -> arg.colorize(Colors.RED)
        arg.length < 3 -> arg.colorize(Colors.GREEN)
        arg.length > 6 -> arg.colorize(Colors.YELLOW)
        arg.length % 2 == 0 -> arg.colorize(Colors.BLUE)
        else -> arg.colorize(Colors.CYAN)}
}

fun f2 (arg: String): String{
    return arg.colorize(Colors.RESET)
}

fun main() {
    "A sd sfsf fsfsfsfs".colorizeWords { fn1(it) }
}