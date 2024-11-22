package org.helgawolf.kotlincourse.lesson23.homework

import org.helgawolf.kotlincourse.lesson21.homework.toMap

fun main(){

    println("зад. 1")

    val item1 = "стринга"
    val item2 = 666
    val item3 = listOf(1,5,"666")
    val item4 = mapOf(1 to "dfjf", "sjsjs" to "djdjd", 666 to 777)
    val item5 = false
    analyzeDataType(item1)
    analyzeDataType(item2)
    analyzeDataType(item3)
    analyzeDataType(item4)
    analyzeDataType(item5)

    println("зад. 2")

    val param1 = listOf(1, 4, 5)
    val param2 = 332434
    println(safeCastToList(param2))
    println(safeCastToList(param2))

    println("зад. 3")

    val thing = "12345"
    val thing2 = 999
    val thing3 = null
    println(getStringLengthOrZero(thing))
    println(getStringLengthOrZero(thing2))
    println(getStringLengthOrZero(thing3))

    println("зад. 4")

    val smth1 = 111
    val smth2 = 111.11
    val smth3 = "11.333"
    val smth4 = true
    raiseToThePowerOfTwo(smth1)
    raiseToThePowerOfTwo(smth2)
    raiseToThePowerOfTwo(smth3)
    raiseToThePowerOfTwo(smth4)

    println("зад. 4")
    val list = listOf(1, 2, 3.0, "aa", false, mapOf(1 to 2))
println(sumIntOrDoubleValues(list))


    println("зад. 5")

    val mixedList: List<Any> = listOf("lol", 123, true, "more lol", mapOf(1 to 9))
    val notAList = 7565

    tryCastToListAndPrint(mixedList)
    tryCastToListAndPrint(notAList)

}




//1.
//Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести соответствующее сообщение:
//Для строки: "Это строка: [значение]".
//Для целого числа: "Это целое число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для карты: "Это карта, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".
//Используйте оператор is для проверки типов.

fun analyzeDataType(item: Any){
    when (item) {
        is String -> println("Это строка: $item")
        is Int -> println("Это целое число: $item")
        is List<*> -> println("Это список, количество элементов: ${item.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${item.size}")
        else -> println("Неизвестный тип данных")
        }
}

//2.
//Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка, если аргумент можно безопасно привести к типу List.
// В случае неудачного приведения функция должна возвращать -1.
//Используйте as? для безопасного приведения типа.

fun safeCastToList(param: Any): Int {
    return (param as? List<*>)?.size ?: -1
}

//3.
//Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any?
// и возвращает длину строки, если аргумент можно привести к типу String.
// В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.

fun getStringLengthOrZero(thing: Any?): Int {
    return (thing as? String)?.length ?: 0
}

//4.
//Создайте функцию, которая принимает параметр типа Any.
//Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”) и должна вернуть квадрат этого числа.
// Если придёт число, его нужно возвести в квадрат, если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

fun raiseToThePowerOfTwo(smth: Any){
    return when (smth) {
        is Int -> println(smth.toDouble() * smth.toDouble())
        is Double -> println(smth * smth)
        is String -> println(Math.pow(smth.toDouble(), 2.0))
        else -> println("что ты от меня хочешь")
    }
}

//5.
//Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех целочисленных
// (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.

fun sumIntOrDoubleValues(list: List<Any>): Double {
var sum = 0.0
    for (i in list){
        when (i){
            //оператор +=, который добавляет значение к существующему значению переменной и сохраняет результат в той же переменной.
            is Int -> sum += i.toDouble() //превращение инта в дабл
            is Double -> sum += i //а тут уже дабл
            //else -> continue
        }
    }
    return sum
}

//Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>.
// Если приведение успешно, функция должна напечатать все строки из списка, если элемент не является строкой то вывести предупреждение об этом.
// Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение программы.

fun tryCastToListAndPrint(param: Any){
    val list = param as? List<*>

    if (list != null) {
        for (i in list) {
            when (i) {
                is String -> println("Элемент $i - строка")
                else -> println("элемент $i не является строкой")
            }
        }
    } else {
        println("не могу к типу List<*>")
    }

}