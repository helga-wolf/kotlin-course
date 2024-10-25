package org.helgawolf.kotlincourse.lesson15.homework

class Concert (
    var band: String,
    val venue: String,
    val cost: Int,
    val capacity: Int) {

    fun info(){
        println("Концерт группы $band пройдет в клубе $venue. Стоимость билета - $cost руб., доступно билетов - $capacity.")
    }

    private var soldTickets: Int = 0

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Билет куплен. Осталось мест: ${capacity - soldTickets}")
        } else {
            println("Все билеты проданы!")
        }
    }

}