package org.example.lessons.lesson26.homework

import java.io.File

fun ex1() {
    with(File("workspace/task1/example.txt")) {
        parentFile.mkdirs()
        createNewFile()
        if (exists()) {
            println("Файл создан")
        } else println("Файл не создан")
    }
}

fun ex2() {
    File("workspace/task2/testDir").apply {
        mkdirs()
        if (isDirectory) {
            println("Это директория")
        } else println("Это не директория")
        println(absolutePath)
    }
}

fun ex3() {
    with(File("workspace/task3/structure")) {
        mkdirs()
        resolve("myDir")
    }.apply {
        mkdir()
        resolve("subDir1").mkdir()
        resolve("subDir2").mkdir()
        val files = list()
        if (files?.all { it.contains("subDir1") || it.contains("subDir2") } ?: false) {
            println("Директории найдены")
        } else {
            println("Директории не найдены в ${list().joinToString()}")
        }
    }
}

fun ex4() {
    with(File("workspace/task4/temp")) {
        resolve("myDir")
    }.apply {
        resolve("subDir1")
    }.apply {
        resolve("subDir2").mkdirs()
    }.apply {
        resolve("file.txt")
        createNewFile()
    }
        .deleteRecursively()
}

fun ex5() {
    with(File("workspace/task5/config/config.txt")) {
        parentFile.mkdirs()
        createNewFile()
        listOf("param 1 = true", "param 2 = false").also {
            writeText(it.joinToString("\n"))
        }
        readLines().map {
            it.split("=")
                .getOrNull(1)
                ?.trim() ?: ""
        }.also {
            println(it.joinToString())
        }
    }
}

fun ex6() {
    File("workspace").apply {
        walk().groupBy { if (it.isDirectory) "dir" else "file" }
            .also {
                println("Directories")
                println(it["dir"]?.joinToString("\n"))
                println("Files")
                println(it["file"]?.joinToString("\n"))
            }
    }
}

fun ex7() {
    val phrase = "This is a README file."
    File("workspace/task7/docs/readme.md").apply {
        parentFile?.mkdirs()
        if (!this.exists()) {
            createNewFile()
            writeText(phrase)
        }
        check(readText() == phrase)
    }
}

fun main() {
    ex1()
    ex2()
    ex3()
    ex4()
    ex5()
    ex6()
    ex7()

}
