package org.helgawolf.kotlincourse.lesson25.homework

//Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.


fun main() {


    //анон
    val unique1 = fun List<Number>.(): List<Number> {
        return toSet().toList()
    }

    //с типом
    val unique2: List<Number>.() -> List<Number> = {
        toSet().toList()
    }

    val listInt = listOf(1, 2, 3, 4, 5, 666, 666, 777, 777)
    val listDouble = listOf(1.0, 2.0, 3.0, 4.0, 5.0, 666.666, 66.666, 777.777, 777.777)

    println(listInt.unique())
    println(listDouble.unique())
    println(listInt.unique1())
    println(listDouble.unique1())
    println(listInt.unique2())
    println(listDouble.unique2())

}

fun List<Number>.unique(): List<Number> {
    return toSet().toList()
}

