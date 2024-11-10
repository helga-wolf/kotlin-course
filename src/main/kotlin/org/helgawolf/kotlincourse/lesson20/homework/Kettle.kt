package org.helgawolf.kotlincourse.lesson20.homework

class Kettle : TemperatureOpenableDevice() {
    override fun setTemperature(temp: Int) {
        if (!isPoweredOn()) {
            println("Установка температуры невозможна. Машина выключена")
            return
        }
        super.setTemperature(temp)
    }
    }
