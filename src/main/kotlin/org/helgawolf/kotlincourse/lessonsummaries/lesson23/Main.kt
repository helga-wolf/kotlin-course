package org.helgawolf.kotlincourse.lessonsummaries.lesson23

fun main() {


    val obj: Any = "Hello World"

    if (obj is String) {
        println("объект явл строкой")
    }

    if (obj !is Int) {
        println("объект не явл целым числом")
    }

    if (obj is String) {
        //obj автоматически приведен к стринг
        println(obj.uppercase()) // доступно тк это теперь стринга
    }

    val num: Any = 123
//    val str: String = num as String
//    println(str)

    val safeStr: String? = num as? String
    println(safeStr)

    val nullableStr: String? =
        "Kotlin" // если тут поставить налл - будет налл поинтер эксепшен, тк ниже хотим налл в строку переделать
    val nonNullableStr: String = nullableStr as String
    println(nonNullableStr)


    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)

    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип")
        }

    }

}


