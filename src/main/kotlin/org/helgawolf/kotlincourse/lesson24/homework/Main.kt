package org.helgawolf.kotlincourse.lesson24.homework

fun main() {
    //задание 4
    //throw ExceptionTask4("исключение из задания 4")

    //задание 5
    try {
        val array = listOf(1, 2, 666)
        array[666]
    }catch (e: ArrayIndexOutOfBoundsException) {
        println("экспепшен из задания 5")
        throw ExceptionTask5(e)
    }

}