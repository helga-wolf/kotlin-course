package org.helgawolf.kotlincourse.lesson22.homework

//Определите функцию-расширение для класса длинного числа, допускающее null, которая не принимает аргументов и возвращает строку.

fun Long?.toFormattedString(): String {
    return when(this) {
        null -> "Значение отсутствует"
        else -> "$this"
    }
}
