package org.helgawolf.kotlincourse.lesson12

fun main(){
    //проверка задачи 1
    val result = multiplyByTwo(4)
    println(result)

    //проверка задачи 2
    val result2 = isEven(3)
    println(result2)

    //проверка задачи 3
    printNumbersUntil(-1)
}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(a: Int): Int{
   return a * 2
}

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven(a: Int): Boolean {
    if (a % 2 == 0) {
        return true
    }
    else return false
}

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int){
    for (n in 1..n){
        println(n)
    }
    if (n < 1){
        return
    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(list: List<Int>): Int? {
    //val list = listOf(1, 2, 3, -4, 5, 6, 7, -8)
    for (number in list) {
        if (number < 0) {
            return number
        }
    }
    return null
}


//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(strings: List<String>){
    var index = 0
    while (index < strings.size && strings[index] != null) {
        println(strings[index++])
    }
}
