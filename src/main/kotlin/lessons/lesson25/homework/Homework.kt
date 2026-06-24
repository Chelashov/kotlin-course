package org.example.lessons.lesson25.homework

fun timeTracker(ex: () -> List<Int>): Long {
    val start = System.currentTimeMillis()
    ex()
    val stop = System.currentTimeMillis()
    println(stop - start)
    return (stop - start)
}

fun ex3(person: Person) {
    with(person) {
        println("Имя $name, возраст $age, почта $email")
    }
}

fun Person?.toEmployee(position: String): Employee? {
    return this?.let {
        Employee(name, age, position)
    }
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }

    timeTracker { myFunction() }

    val employee1 = Employee("Коля", 31, "Аналитик")
        .apply { email = "kolya1997@mail.ru"; department = "IT" }

    val person1 = Person("Юля", 30).also { it.email = "julka-pulka@gmail.com"; ex3(it) }

    with(person1) { Employee(name, age, position = "Девопс") }

    person1.run {
        Employee(name, age, position = "Девопс")
    }


}