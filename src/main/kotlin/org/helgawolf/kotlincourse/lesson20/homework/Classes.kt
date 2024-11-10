package org.helgawolf.kotlincourse.lesson20.homework

import java.io.InputStream

//Создай абстрактные классы устройств, используя эти интерфейсы. Реализовывать методы не нужно.
//Холодильник

abstract class Fridge : Powerable, Openable, TemperatureRegulatable, LightEmitting, SoundEmitting, Cleanable{
    override fun powerOn() {}
    override fun powerOff() {}

    override fun open(){}
    override fun close(){}

    abstract override val maxTemperature: Int
    override fun setTemperature(temp: Int){}

    override fun emitLight(){}
    override fun completeLiteEmission(){}

    override fun setVolume(volume: Int){}
    override fun mute(){}
    override fun playSound(stream: InputStream){}

    override fun clean(){}
}

//Стиральная машина

abstract class WashingMachine : Powerable, Openable, WaterContainer, AutomaticShutdown, TemperatureRegulatable, WaterConnection, Drainable, Timable, Programmable, Cleanable {

    override fun powerOn() {}
    override fun powerOff() {}

    override fun open(){}
    override fun close(){}


}

//Умная лампа

    abstract class SmartBulb : Powerable, Programmable, LightEmitting{
        override fun powerOn() {}
        override fun powerOff() {}

        override fun emitLight(){}
        override fun completeLiteEmission(){}
    }

//Электронные часы

    abstract class DigitalWatch : Powerable, LightEmitting, SoundEmitting, BatteryOperated, Rechargeable{
        override fun powerOn() {}
        override fun powerOff() {}

        override fun setVolume(volume: Int){}
        override fun mute(){}
        override fun playSound(stream: InputStream){}
    }

//Робот-пылесос

abstract class RobotVacuum : Powerable, Openable, WaterContainer, AutomaticShutdown, Drainable, Timable, BatteryOperated, Rechargeable, SoundEmitting, Programmable, Movable, Cleanable{
    override fun powerOn() {}
    override fun powerOff() {}

    override fun open(){}
    override fun close(){}

    override fun setVolume(volume: Int){}
    override fun mute(){}
    override fun playSound(stream: InputStream){}
}

//Механические часы

abstract class MechanicWatch : Mechanical, Timable{

}

//Фонарик
abstract class Flashlight : Powerable, BatteryOperated, Rechargeable, LightEmitting{
    override fun powerOn() {}
    override fun powerOff() {}

    override fun emitLight(){}
    override fun completeLiteEmission(){}
}

//Кофемашина

abstract class CoffeeMachine : Powerable, Openable, WaterContainer, WaterConnection, Drainable, Cleanable, Timable{
    override fun powerOn() {}
    override fun powerOff() {}

    override fun open(){}
    override fun close(){}
}

//Умная колонка

abstract class SmartSpeaker : Powerable, BatteryOperated, SoundEmitting, Rechargeable, Programmable, LightEmitting{
    override fun powerOn() {}
    override fun powerOff() {}

    override fun emitLight(){}
    override fun completeLiteEmission(){}
}


