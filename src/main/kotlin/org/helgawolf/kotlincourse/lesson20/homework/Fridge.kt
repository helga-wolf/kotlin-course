package org.helgawolf.kotlincourse.lesson20.homework

class FridgeNonAbstract : TemperatureOpenableDevice() {
        override fun setTemperature(temp: Int) {
            if (!isPoweredOn()) {
                println("Не могу установить температуру. Холодильник выключен")
                return
            }
        }

        override fun programAction(action: String) {
            if (!isPoweredOn()) {
                println("Не могу запрограммировать. Холодильник выключен.")
                return
            }
            super.programAction(action)
        }
    }
