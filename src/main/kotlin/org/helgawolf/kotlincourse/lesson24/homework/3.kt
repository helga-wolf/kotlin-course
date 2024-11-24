package org.helgawolf.kotlincourse.lesson24.homework

//Задание 3. Оберни все вызовы из предыдущего задания в блок try-catch с одним блоком catch для любого типа исключений. Внутри блока catch, используя when, напиши для каждого исключения вывод в консоль специфического сообщения, подходящего под каждый из типов.

fun main() {

    try{
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
    } catch (e: Exception){
        when (e){
            is NullPointerException -> println("упс, вы вызвали NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("это ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("вызвано ClassCastException")
            is NumberFormatException -> println("опять эксепшон, на этот раз NumberFormatException")
            is IllegalArgumentException -> println("IllegalArgumentException вызывается, оповещение печатается")
            is IllegalStateException -> println("ничего, скоро уже конец. IllegalStateException")
            is OutOfMemoryError -> println("довели, вот и OutOfMemoryError")
            is StackOverflowError -> println("стек переполнен, рекурсия - это тебе не игрушки")
        }
    }
}