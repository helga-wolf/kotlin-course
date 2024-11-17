package org.helgawolf.kotlincourse.lesson22.homework


//Создайте функцию-расширение для класса изменяемого списка элементов с дженериком, которая принимает два аргумента: один типа дженерик, допускающий null, и другой типа число, и возвращает значение типа дженерик, допускающий null.

fun <T> MutableList<T>.findElementOrNull(element: T?, index: Int): T? {
    return if (index in 0 until size && element == get(index)) {
        element
    } else {
        null
    }
}
