package org.helgawolf.kotlincourse.lesson27.homework


//Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет время её выполнения.
//Функция timeTracker должна возвращать затраченное время в миллисекундах. Для измерения времени
//используйте System.currentTimeMillis() до и после выполнения переданной функции.

fun timeTracker(functionToTrack: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    functionToTrack()
    val endTime = System.currentTimeMillis()
    return endTime - startTime // заставило переделать возвращаемый тип в лонг
}

fun main() {
    fun someFunction() {
        println("типа тело функции")
    }

    val executionTime = timeTracker(::someFunction)
    println("время выполнения функции: $executionTime миллисекунд")
}
