package org.helgawolf.kotlincourse.lesson24.homework
//
//Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:

fun main() {
//NullPointerException

    val nullable = null
   nullable as String

//ArrayIndexOutOfBoundsException

    val array = listOf(1, 2, 666)
    array[666]

//ClassCastException

    val string = "uytfhgf"
    val int = string as Int

//NumberFormatException

    val str = "abc123"
    str.toInt()

//IllegalArgumentException

    val inputString: String = "" //строка пустая чтоб вылезла ошибка
    // воспользуемся ф-ей кот описана ниже, чтобы выкинуло иллигал аргумент
    validateString(inputString)


//IllegalStateException

    val b = 0
    check(b == 1) // проверка правда ли б == 1 (неправда - будет исключение_

//OutOfMemoryError

    val list = mutableListOf("")

    while (true) {

        list.add("добавлять пока не вылезет ошибка")
    }

//StackOverflowError

recursion()

}



    // это ф-я для IllegalArgumentException
    fun validateString(str: String?) {
        // здесь проверяем что строка не нулевая и не пустая
        require(!str.isNullOrEmpty()) { "Строка не должна быть пустой или null." }
    }


fun recursion(){
    recursionB()
}

fun recursionB(){
    recursion()
}