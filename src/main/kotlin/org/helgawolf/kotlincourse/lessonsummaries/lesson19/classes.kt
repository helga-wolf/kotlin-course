package org.helgawolf.kotlincourse.lessonsummaries.lesson19

class Lamp(){
    private var isOn = false
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
}

open class GameConsole(){
    private fun startGame(nameGame: String){
        initHardware()
        loadGame(nameGame)
    }
    protected open fun initHardware(){}
    private fun loadGame(nameGame: String){}
}

class PlayStation : GameConsole(){
    override fun initHardware() {
        super.initHardware()
        //HashMap
    }
}

class Atm(private var balance: Float = 0f){
    private var pin: String = "2333"
    fun deposit(amount: Float, pin: String){
        if (pin != this.pin)//обращаемся к полю класса
            throw Exception("пин неверный")
    }
    fun withdraw(amount: Float, pin: String){
        if (pin != this.pin)//обращаемся к полю класса
            throw Exception("пин неверный")
    }
    fun getBalance(pin: String): Float{
        checkPin(pin)//вместо if как в предыд методах
        return balance
    }
    fun checkPin(pin: String){
        if (pin != this.pin)//обращаемся к полю класса
            throw Exception("пин неверный")
    }
}


fun main() {
    val playStation = PlayStation()
    //playStation.initHardware()

}