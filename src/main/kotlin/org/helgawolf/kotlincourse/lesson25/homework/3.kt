package org.helgawolf.kotlincourse.lesson25.homework

//Задание 3. Создай функцию, которая принимает список строк и число, а возвращает список из строк, длина которых больше или равна заданному числу. Если список пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.


fun main() {

    //анон
    val listOfStrings1 = fun (stringList: List<String>, number: Int): List<String> {
        require(stringList.isNotEmpty()) { "список не м б пустым" }
        return stringList.filter { it.length >= number }
    }

    //лямбда с типом
    val listOfStrings2: (List<String>, Int) -> List<String> = { stringList, number ->
        require(stringList.isNotEmpty()) { "Список не может быть пустым" }
        stringList.filter { it.length >= number }
    }

    //лямбда без типа
    val listOfStrings3 = { stringList: List<String>, number: Int ->
    require(stringList.isNotEmpty()) { "Список не должен быть пустым" }
    stringList.filter { it.length >= number }
    }

    val emptyList = mutableListOf<String>()
    val stringList = listOf("a", "кот", "жж", "лллл", "щщщщщ", "sjsjsjsjsjs")

    //println(listOfStrings(emptyList, 10))
    println(listOfStrings(stringList, 1))
    println(listOfStrings1(stringList, 2))
    println(listOfStrings2(stringList, 3))
    println(listOfStrings3(stringList, 4))

}

fun listOfStrings(stringList: List<String>, number: Int): List<String>{
    require(stringList.isNotEmpty()) { "список не м б пустым" }
    return stringList.filter { it.length >= number }
}