package org.helgawolf.kotlincourse.lesson22.homework

//Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел.

fun IntArray.firstAndLast(): Pair<Int, Int> {
    return if (isNotEmpty()) {
        this[0] to this[lastIndex]
    } else {
        // Если массив пустой, вернем нулевую пару
        0 to 0
    }
}
