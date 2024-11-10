package org.helgawolf.kotlincourse.lesson20.homework

class WashingMachineNonAbstract : TemperatureOpenableDevice() {
    val capacity = 60
    override var maxTemperature = 90
    override fun setTemperature(temp: Int) {
        if (!isPoweredOn()) {
            println("Установка температуры невозможна. Машина выключена")
            return
        }
        super.setTemperature(temp)
    }



}