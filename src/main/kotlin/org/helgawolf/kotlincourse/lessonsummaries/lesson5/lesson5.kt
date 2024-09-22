package org.helgawolf.kotlincourse.lessonsummaries.lesson5

fun mainlol() {
    val sum = 10 + 5
    val diff = 10 - 5
    val product = 10 * 5
    val quotient = 10 / 5 //просто деление
    val remainder = 10 % 3
    val isEqual = (5 == 5)
    val isNotEqual = (5 != 3)
    val isGreater = (5 > 3)
    val isLesser = (2 < 3)
    val isGreaterOrEqual = (5 >= 5)
    val isLesserOrEqual = (5 <= 7)
    var number = 5
    number = number + 5
    number -= 1

    println(number)

}

//приоритет логич операций:
//        НЕ
//        И
//        ИЛИ

fun lol() {

    var name: String? = null

    val result = name ?: throw IllegalArgumentException("што ета")
//если null то выполнить то-то

}

fun printVolumelol(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}