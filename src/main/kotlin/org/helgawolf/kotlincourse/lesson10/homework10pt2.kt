package org.helgawolf.kotlincourse.lesson10

fun main() {
//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.

val emptyImmutableList: List<Int> = listOf(1, 23, 4)

//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

val helloList = listOf("Hello", "World", "Kotlin")

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

val numberList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

    numberList.add(6)//добавляю в список из задания 3
    numberList.add(7)
    numberList.add(8)

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    val helloMutableList = mutableListOf("Hello", "World", "Kotlin")
    helloMutableList.remove("World")

//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

    for (number in numberList){
        println(number)//использую список из задания 3
    }

//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.



//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val firstList = listOf("lol", "kek", "cheburek")
    val secondList = listOf("лол", "кек", "чебурек")

    val combinedList = ArrayList<String>()

    for (item in firstList) {
        combinedList.add(item)
    }

    for (item in secondList) {
        combinedList.add(item)
    }

    println("Combined list: $combinedList")

//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val numbers123 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var minValue = numbers123[0]
    var maxValue = numbers123[0]

    for (number in numbers123) {
        if (number < minValue) {
            minValue = number
        }
        if (number > maxValue) {
            maxValue = number
        }
    }

    println("Minimum value: $minValue")
    println("Maximum value: $maxValue")

//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val originalList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbersList = ArrayList<Int>()
    val number1 = 9
    for (number1 in originalList) {
        if (number1 % 2 == 0) {
            evenNumbersList.add(number1)
        }
    }
    println("Even numbers from the original list: $evenNumbersList")



}