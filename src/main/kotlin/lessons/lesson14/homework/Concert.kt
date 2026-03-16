package org.example.lessons.lesson14.homework

class Concert(
    var group: String,
    var place: String,
    var price: Double,
    var places: Int,
    private var soldTickets: Int
) {
    fun concertInfo () {println("Выступает группа $group. Место: $place." +
            " Стоимость билета: $price рублей")}
    fun buyTicket() { if (soldTickets < places) soldTickets++; println(soldTickets)}

}

fun main() {
    val concert = Concert("Звери", "Ресторан Сан-Тропе",
        3500.0,300, 250)
    concert.concertInfo()
    concert.buyTicket()

}