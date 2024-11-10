package org.helgawolf.kotlincourse.lesson20.homework

abstract class TemperatureOpenableDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {

    override var maxTemperature = 10
    var minTemperature = -30
    var currenttemperature = 0
    var newTemperature = readln().toInt()
    fun setTemperature(){
        if (newTemperature !in -30..10) {
            println("Внимание! Температура должна быть от -30 до 10 градусов. Попытка установить недопустимое значение: $newTemperature")
            return
        }

        println("Установлена новая температура холодильника: $newTemperature градусов.")
    }

    private var isOpen: Boolean = false
    override fun open() {
        isOpen = true
            println("Холодильник открыт")
        }

    override fun close() {
        isOpen = false
        println("Холодильник закрыт")
    }
}
