package org.helgawolf.kotlincourse.lessonsummaries.lesson20

abstract class HouseholdAppliance(val brand: String): Powerable { // какая-то абстракьтгая техника

    abstract val applianceType: String

    var isPoweredOn: Boolean = false
        private set // установка значения только внутри класса

    abstract fun operate() // абсркатно описывает, что м делать любая бытовая техника, которая будет отсюда насл-ся

    override fun powerOn() {
        isPoweredOn = true
        println("$applianceType от $brand включено.")
        onPowerChange()
    }

//    fun powerOff() {
//        isPoweredOn = false
//        println("$applianceType от $brand выключено.")
//        onPowerChange()
 //   }

    private fun onPowerChange() {
        if (isPoweredOn) {
            println("Устройство готово к работе.")
        } else {
            println("Устройство выключено.")
        }
    }


    protected open fun performMaintenance() { // опен - доступен для переопределения
        println("Выполняется обслуживание $applianceType от $brand.")
    }
}

class Microwave(brand: String) : HouseholdAppliance(brand) {
    override val applianceType: String = "Микроволновая печь"

    override fun operate() {
        if (isPoweredOn) {
            println("Готовим еду в микроволновке от $brand.")
            performMaintenance()
        } else {
            println("Микроволновая печь от $brand не включена. Пожалуйста, включите ее.")
        }
    }

    override fun performMaintenance() {
        super.performMaintenance()
        println("Чистка микроволновой печи от $brand.")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }
}

fun main () {
    val microwave = Microwave("Samsung")
    microwave.powerOn() // включаем в сеть
    microwave.operate() // включаем функцию (разогрев в данном случае)

}