package org.helgawolf.kotlincourse.lesson12

fun main(){
//average(numbers = listOf(1, 2, 3, 4))

}

//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

fun fun1() = Unit

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

fun sum(a: Int, b: Int): Int {
    return a + b
}

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

fun acceptString(a: String) = Unit

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

fun average(numbers: List<Int>): Int {
// Сумма всех элементов списка
    val total = numbers.sum()

    // Количество элементов в списке
    val count = numbers.size

    // Среднее значение
    val average = total / count

    return average

}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

fun nullableString(str: String?): Int? {
    return str?.length
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

fun realNumber(): Double? {
    return 0.0
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.

fun numbersList(numbers: List<Int>){}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.

fun intNumber(int: Int): String? {
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

fun nullableListOfStrings(): List<String?>{
    return listOf()
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun nullableEverything(a:String?, b: Int?): Boolean? {
    return when {
        a == null || b == null -> null
    else -> true
    }
}