package org.helgawolf.kotlincourse.lessonsummaries.lesson25

fun main() {

    //String. означает что расщиряем класс стринг
    val fun5 = fun String.(arg: Int, arg2: Int): Boolean {
        println(this)
        println(arg)
        println(arg2)
        return arg == arg2
    }

    //лямбда
    val fun6: String.(Int, Int) -> Boolean = { arg, arg2 -> // указываем агрументы тут
        println(this)
        println(arg)
        println(arg2)
        arg == arg2
    }
    println("hello world".fun6(3, 666))


}

//ф-я расширяет класс стринг, принимает 2 числа и возвращает буль
fun String.reverse(arg: Int, arg2: Int): Boolean {
    println(this)
    println(arg)
    println(arg2)
    return arg == arg2
}