package org.helgawolf.kotlincourse.lessonsummaries.lesson23

fun main() {
    val flyingCar = FlyingCar()

    checkCapabilities(flyingCar)
}


interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class FlyingCar : Drivable, Flyable {
    override fun drive() {
        println("Едет как автомобиль")
    }

    override fun fly() {
        println("Летит как самолёт")
    }
}

fun checkCapabilities(drivable: Drivable) {
    drivable.drive()

    if (drivable is Flyable) {
        println("Этот объект также может летать!")
        drivable.fly()
    } else {
        println("Этот объект не может летать.")
    }
}