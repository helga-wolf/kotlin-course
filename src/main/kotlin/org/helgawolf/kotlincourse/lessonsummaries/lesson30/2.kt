package org.helgawolf.kotlincourse.lessonsummaries.lesson30

enum class Seasons(val firstMonthName: String, val isVolatileDuration: Boolean = false) {
    WINTER("December", true),
    SPRING("March"),
    SUMMER("June"),
    AUTUMN("September"),
    ;

    fun printInfo() {
        println("В $this первый месяц $firstMonthName сезон${ if (isVolatileDuration) " с изменяемой " else " c неизменяемой "}продолжительностью")
    }

    companion object {
        fun detectSeason (firstMonthName1: String): Seasons {
          return entries.filter { it.firstMonthName == firstMonthName1 }.firstOrNull() ?: throw IllegalArgumentException()
        }
    }
}


interface HasValue {
    val value: String
}

interface HasAction {
    fun action()
}

enum class HomeDevices(
    override val value: String

) : HasValue, HasAction {
    FRIDGE("хол-к") {
        override fun action() {
            print("freeze")
        }
    },
    WASHER("стиралка") {
        override fun action() {
            println("wash")
        }
    },
    TV("телек"),
    ;

    override fun action() {
        println("turn on $value")
    }



}


fun main() {
    Seasons.WINTER.printInfo()
    Seasons.SUMMER.printInfo()

    println(Seasons.detectSeason("December"))
    //println(Seasons.detectSeason("august"))

    HomeDevices.FRIDGE.action()
    HomeDevices.WASHER.action()
    HomeDevices.TV.action()
    

}

fun example (interface1: HasValue) {
    interface1.value
}


