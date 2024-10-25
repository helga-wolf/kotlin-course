package org.helgawolf.kotlincourse.lesson15.homework

class Party (val location: String, val attendees: Int) {
    fun details() {
        println("Вечеринка проходит в $location.")
        println("На ней присутствует $attendees гостей.")
    }

}