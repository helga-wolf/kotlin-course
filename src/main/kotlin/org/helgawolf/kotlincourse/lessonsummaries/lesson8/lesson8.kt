package org.helgawolf.kotlincourse.lessonsummaries.lesson8

fun main() {
    val firstName = "Ivan"
    val lastname = "Ivanov"
    val fullName = firstName + " " + lastname

    val age = 30
    val greeting = "hello my name is $firstName, и мне $age лет"

    println(greeting)

    val person = Person("Алексей", 25)
    val intro = "меня зовут $person.name, и мне ${person.age} лет"


    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
    println(resultString)

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(9)
    val subString2 = originalString.substring(3, 6)
    //считаем начиная с 0, 6 не входит в диапазон
    val replaceString = originalString.replace("K", "TT")
    val words = originalString.split("")
    //в кавычках слово по кот произв ся разделение
    val length = "hello".length
    val upper = "hi".uppercase()
    val lower = "HI THERE".lowercase()
    val trimmed = "    Hi    ".trim()
    val starts = "Kotlin".startsWith("ot") //проверка тру-фолс
    val ends = "Kotlin".endsWith("o")
    val contains = "Hello".contains("p")

    val e: String? = "lol"
    val empty = e.isNullOrEmpty() //проверка на налл/пустоту

    val blank = "  ".isNullOrBlank() //что в строке нет значимых символов
    val repeat = "ab".repeat(9)
    val letter = originalString[5] // распечатываем символ с данным индексом начиная С НУЛЯ
    val indexOfChar = "sdhfjshg".indexOf('s')
    val indexOfWord = "kfj sdkfjej".indexOf("kfj")
    val backReverse = "jsdhf".reversed()
    val multLineString = "".trimIndent()


    //форматирование строк
    val balance = 666.666
    val text = """
    Баланс: RUR%,.2f
""".trimIndent()


    //  println(text.format(balance))
//    println(words.joinToString ("/n"))

    println(convert("Для завершения проекта важно"))

    val text1 = "Kotlin: The Fun Way to Learn Programming"
    println(text1.substring(8, 19))
    val text2 = "contact@example.com"
    val indexOfAt = text2.indexOf('@')
    println(text2.substring(indexOfAt + 1))

    val phoneNumber =  "123-456-7890"
    val subString1 = phoneNumber.substring(8)
    println("XXX-XXX-$subString1")
}

class Person(val name: String, val age: Int)


fun convert(string: String): String{
    return when {
        string.startsWith("ошибка", true) -> string.replace("ошибка", "небольшое недоразумение", true)
        string.endsWith("важно",true) -> "$string ...но не критично"
         else -> ""
    }
}



