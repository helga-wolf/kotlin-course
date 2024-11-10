package org.helgawolf.kotlincourse.lesson20.homework

abstract class PowerableDevice : Powerable {

    private var isOn = false
    override fun powerOn() {
        isOn = true
        println("Устройство включено")
    }

    override fun powerOff() {
        println("Устройство выключено")
        isOn = false
    }

    protected fun isPoweredOn(): Boolean {
        return isOn
    }
}