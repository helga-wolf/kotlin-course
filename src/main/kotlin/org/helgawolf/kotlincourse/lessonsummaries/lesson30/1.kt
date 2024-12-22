package org.helgawolf.kotlincourse.lessonsummaries.lesson30

//enum перечисления - для моделирования ГРУППЫ КОНСТАНТ
// напр дни недели

// в енамах все заглавными и разделено нижним подчеркиванием

//объект - со соими полями и методами. можем напрямую к нему и его полям обращаться

//мы тут не можем работать с константами как с группой - перебрать нарпрмеи
object NumsObject {

    const val ONE = "ONE"
    const val TWO = "TWO"
    const val THREE = "THREE"
}

//на помощь приходит енам класс
enum class Nums {
    ONE,
    TWO,
    THREE,
    FOUR
}

fun main() {

    DayOfWeek.FRIDAY.printDayType()

    println(NumsObject.THREE)
    val t: Nums = Nums.ONE
    println(Nums.ONE)
    for (n in Nums.entries) {
        //entries возвр список. фором мы пробегаемся и распечатываем
        println(n)
    }
}

fun printNum (num: Nums) {
    when (num) {
        Nums.ONE -> println(1)
        Nums.TWO -> TODO()
        Nums.THREE -> TODO()
        Nums.FOUR -> TODO()
    }
}

// если мы добавим в енам что-то еще то будет ошибка в when - надо добавить недостающие бранчи

enum class DayOfWeek(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true); //точка с зпт заканчивает перечисление, чтобы дальше писать методы для объектов енама
//енам нельзя изменить в рантайме


    fun printDayType() {
        if(isWeekend) println("$name is a weekend")
        else println("$name is a weekday")
    }
}

enum class CoffeeType(
    val cost: Double,
    val coffeeBase: String,
    val recommendedSugar: Int,
    val hasMilk: Boolean = false
) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0);

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}


