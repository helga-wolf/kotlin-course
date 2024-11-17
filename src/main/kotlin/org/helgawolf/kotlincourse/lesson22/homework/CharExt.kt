package org.helgawolf.kotlincourse.lesson22.homework

//Напишите функцию-расширение для класса символа, допускающего null, которая принимает три аргумента: два типа число и один булево, и ничего не возвращает.

fun Char?.myExtensionFunction(num1: Int, num2: Double, isConditionTrue: Boolean) {
    if (this != null && isConditionTrue) {
        println("Символ: $this, Число 1: $num1, Число 2: $num2")
    } else {
        println("Символ равен null или условие ложно.")
    }
}
