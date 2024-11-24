package org.helgawolf.kotlincourse.lesson24.homework

//Задание 2. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок

fun main() {
//NullPointerException

    try {
        val nullable = null
        nullable as String
    } catch (e: NullPointerException){
        println("упс, вы вызвали NullPointerException")
    }

//ArrayIndexOutOfBoundsException

    try {
    val array = listOf(1, 2, 666)
    array[666]
    } catch (e: ArrayIndexOutOfBoundsException){
        println("это rrayIndexOutOfBoundsException")
    }

//ClassCastException

    try {
        val string = "uytfhgf"
        val int = string as Int
    } catch (e: ClassCastException){
        println("вызвано ClassCastException")
    }

//NumberFormatException

    try {
        val str = "abc123"
        str.toInt()
    } catch (e: NumberFormatException){
        println("опять эксепшон, на этот раз NumberFormatException")
    }

//IllegalArgumentException

    try {
        val inputString: String = "" //строка пустая чтоб вылезла ошибка
        // воспользуемся ф-ей кот описана ниже, чтобы выкинуло иллигал аргумент
        validateString(inputString)
    } catch (e: IllegalArgumentException){
        println("IllegalArgumentException вызывается, оповещение печатается")
    }


//IllegalStateException

    try {
        val b = 0
        check(b == 1) // проверка правда ли б == 1 (неправда - будет исключение_
    } catch (e: IllegalStateException){
        println("ничего, скоро уже конец. IllegalStateException")
    }
//OutOfMemoryError

    try {
        val list = mutableListOf("")

        while (true) {

            list.add("добавлять пока не вылезет ошибка")
        }
    } catch (e: OutOfMemoryError){
        println("довели, вот и OutOfMemoryError")
    }

//StackOverflowError

    try {
        recursion()
    } catch (e: StackOverflowError){
        println("Стек имеет фиксированный размер, и если в программе происходит слишком много вложенных вызовов функций (например, в результате бесконечной рекурсии), это может привести к переполнению стека (Stack Overflow).")
    }

}
