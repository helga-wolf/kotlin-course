package org.helgawolf.kotlincourse.lesson19.homework

class GamingAvtomat {

    // Поля
    val color: String = "green" // Цвет (неизменяемое значение)
    val model: String = "ABC8749857" // Модель игрового автомата (неизменяемое значение)
    var isOn: Boolean = false // Состояние включения автомата (может изменяться)
    var OsLoaded: Boolean = false // Загрузка операционной системы (может изменяться)
    val gamesAvailable: List<String> = listOf() // Список доступных игр (неизменяемый)
    var hasJoystick: Boolean = true // Наличие джойстика (может изменяться)
    private var gescheftBalance: Double = 0.0//Баланс вырученных средств (может изменяться)
    private val owner: String = "Masha Ivanova"// Владелец автомата (неизменяемое значение)
    val supportPhone: String = "98787786866666" // Телефон поддержки (неизменяемое значение)

    // Методы
    fun isOn() { // Включение
        if (!isOn) {
            isOn = true
            println("Автомат включен")
        }
    }

    fun isOff() {  // Выключаем
        if (isOn) {
            isOn = false
            println("Автомат выключен")
        }
    }

    fun loadOs() { // Загружаем ОС
        if (!OsLoaded && isOn) {
            OsLoaded = true
            println("Операционная система загружена")
        }
    }

    fun switchOffOs() {//Завершаем работу ОС
        if (OsLoaded) {
            OsLoaded = false
            println("Операционная система все")
        }
    }

    fun showGameList(): List<String> {  //Возвращает список доступных игр
        return gamesAvailable
    }

    fun turnOnGame(gameName: String) { // Запускаем игру
        if (gameName in gamesAvailable && OsLoaded) {
            println("Игра $gameName запущена")
        } else {
            println("Ошибка запуска игры")
        }
    }

    fun payForGamingSession(cost: Double) {  //Оплачиваем, можно и стринг
        if (isOn && OsLoaded) {
            gescheftBalance += cost
            println("Игровой сеанс оплачен на сумму $cost")
        } else {
            println("Не удалось оплатить")
        }
    }

    fun openSafeGiveMoney(amount: Double) {  // Открывает сейф и выдает наличные
        if (isOn && gescheftBalance >= amount) {
            gescheftBalance -= amount
            println("Выдано наличными $amount")
        } else {
            println("Нету деняк")
        }
    }

    fun payWin(amount: Double) { // Выплачивает выигрыш
        if (isOn && gescheftBalance >= amount) {
            gescheftBalance -= amount
            println("Выплачено выигрыша на сумму $amount")
        } else {
            println("Нету деняк")
        }
    }
}
