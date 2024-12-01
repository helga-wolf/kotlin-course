package org.helgawolf.kotlincourse.lesson25.homework

//Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка. С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).


fun main() {

    val listOfNumbers = listOf(1.0, 2.0, 666.666)
    val empty = mutableListOf<Double>()

    //анон
    val arithmeticMean1 = fun (listOfNumbers: List<Double>): Double{
        require(listOfNumbers.isNotEmpty()) {"список не м б пустым" }
        return listOfNumbers.sum() / listOfNumbers.size
    }

    //лямбда с типом

    val arithmeticMean2: (List<Double>) -> Double = {
        require(it.isNotEmpty()) {"список не м б пустым" }
        it.sum() / it.size
    }

    //лямбда без типа

    val arithmeticMean3 = { listOfNumbers: List<Double> ->
        listOfNumbers.sum() / listOfNumbers.size
    }

   // println(arithmeticMean1(empty))
    println(arithmeticMean(listOfNumbers))
    println(arithmeticMean1(listOfNumbers))
    println(arithmeticMean2(listOfNumbers))
    println(arithmeticMean3(listOfNumbers))


}

fun arithmeticMean(listOfNumbers: List<Double>): Double{
require(listOfNumbers.isNotEmpty()) {"список не м б пустым" }
    return listOfNumbers.sum() / listOfNumbers.size
}
