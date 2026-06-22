package org.example.lessons.lesson25.homework

fun timeTracker (ex: () -> List<Int>) : Long{
    System.currentTimeMillis()
    ex()
    println(System.currentTimeMillis())
    return System.currentTimeMillis()
}

fun ex3 (person: Person) {
    with(person) {
        println("Имя $name, возраст $age, почта $email")
    }
}

fun Person?.toEmployee (): Employee?{
    let{
        Employee(it?.name ?: "", it?.age ?: 0, position = "")
    }
    return toEmployee()
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }

    timeTracker {myFunction()}

    val employee1 = Employee("Коля", 31, "Аналитик")
        .apply { email = "kolya1997@mail.ru"; department = "IT"  }

    val person1 = Person("Юля", 30).also { it.email = "julka-pulka@gmail.com"; ex3(it) }

    with (person1) { Employee(name, age, position = "Девопс") }

    person1.run {
        Employee(name, age, position = "Девопс")
    }


}