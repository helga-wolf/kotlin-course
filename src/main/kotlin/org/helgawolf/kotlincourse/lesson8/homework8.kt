package org.helgawolf.kotlincourse.lesson8

import kotlin.math.log

fun main(){

    println(convert("жопа"))// вызов функции с преобразованием фраз

//Задание 1: Извлечение Даты из Строки Лога.
    val logEntry = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val indexOfDate = logEntry.indexOf('>')
    println(logEntry.substring(indexOfDate + 2, indexOfDate + 13))//начало и конец даты
    println(logEntry.substring(indexOfDate + 13))// начало вмремени

//Задание 2: Маскирование Личных Данных
    val cardNumber = "4539 1488 0343 6467"
    val toBeMasked = cardNumber.substring(14)
    println("**** **** ****$toBeMasked")

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
    val email = "username@example.com"
    val maskEmail = email.replace("@", " [at] ")
    println(maskEmail)

//Задание 4: Извлечение Имени Файла из Пути
    val filePath = "C:/Пользователи/Документы/report.txt"
    val fileName = filePath.substringAfterLast('/')//берет то, что наодится после последнего упоминания указанного символа
    println(fileName)

//Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения. Используй for для перебора слов. Используй var переменную для накопления первых букв.
    val phrase = "Объектно-ориентированное программирование"
    val abbreviation = phrase.split("-, ")
    var
    println(abbreviation)


}

fun convert(string: String): String{
    return when {
        string.contains("невозможно",true) -> string.replace("невозможно", "совершенно точно возможно, просто требует времени", true)
        string.startsWith("Я не уверен", true) -> "$string, но моя интуиция говорит об обратном"
        string.contains("катастрофа", true) -> string.replace("а катастрофа", "о интересное событие")
        string.endsWith("без проблем") -> string.replace("без проблем", "спарой интересных вызовов на пути")
        string.split(" ").size == 1 -> "Иногда $string, но не всегда."
        //size возвращает колво элементов в массиве
        else -> ""
    }
}