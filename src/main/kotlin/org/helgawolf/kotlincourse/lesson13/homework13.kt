package org.helgawolf.kotlincourse.lesson13

fun main() {

//Проверить, что размер коллекции больше 5 элементов.
val collection = mutableListOf(1,2,3,4,5)
    if (collection.size > 5) {
        println("Коллекция содержит больше 5 элементов")
    } else {
        println("Коллекция содержит меньше или ровно 5 элементов")
    }

//Проверить, что коллекция пустая

    val isEmpty = collection.isEmpty()
    println(isEmpty)

//Проверить, что коллекция не пустая
    val isNotEmpty = collection.isNotEmpty()
    println(isNotEmpty)

//Взять элемент по индексу или создать значение если индекса не существует

val getOrElse = collection.getOrElse(3){ 0 }
    println(getOrElse)

//Собрать коллекцию в строку

    val incrementedNumbers: List<String> = collection.map { "$it" }
    println(incrementedNumbers)

//Посчитать сумму всех значений

    val sum = collection.sum()
    println(sum)

//Посчитать среднее

    val avg = collection.average()
    println(avg)

//Взять максимальное число

    val max = collection.max()
    println(max)

//Взять минимальное число

    val min = collection.min()
    println(min)

//Взять первое число или null

    val firstOrNull = collection.firstOrNull()

//Проверить что коллекция содержит элемент

    val contains = collection.contains(2)
    println(contains)

}