package org.helgawolf.kotlincourse.lessonsummaries.lesson15
//object - это одновременно и класс и объект
object Logger {

    private var data = 0

    fun log(message: String) {
        println("Log: $message")
    }

    fun  setdata(data: Int) {
        this.data
    }
}
