package org.helgawolf.kotlincourse.lessonsummaries.lesson20


//абстракция - что, а не как
//исключаем незначительные характеристики
// реализаций м б много но нам главное ЧТО

// 2 возмти для абстр описания программы: интерфейс и абстрактный класс
// интерфейс описыват автомарное действие - суффиксом able
// например самолет flyable, методы набор высоты и снижение
// в теле интерфейса нет аргументов
// может быть companion object
interface Device {
    // Константа, определенная в companion object
    companion object {
        const val DEVICE_TYPE = "Generic Device"
    }

    // Абстрактное свойство (поле), которое должно быть переопределено в классе, реализующем интерфейс
    val deviceId: String

    // Абстрактные методы без реализации
    fun turnOn()
    fun turnOff()

    // Метод с реализацией, вызывающий приватный метод
    fun restart() {
        turnOff()
        logAction("Устройство с ID $deviceId выключено для перезагрузки.")
        turnOn()
        logAction("Устройство с ID $deviceId включено после перезагрузки.")
    }

    // Приватный метод с реализацией (доступно начиная с Kotlin 1.4)
    private fun logAction(action: String) {
        println("Лог действия устройства: $action")
    }
}

class Laptop : Device {
    override val deviceId: String = "uyut"

    override fun turnOn() {
        TODO("Not yet implemented")
    }

    override fun turnOff() {
        TODO("Not yet implemented")
    }
}