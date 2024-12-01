package org.helgawolf.kotlincourse.lessonsummaries.lesson25


fun main(){
    val increment = fun (a: Int): Int {
        return a + 1
    }
    println(increment(1))


    val increment1: (Int) -> Int = { a ->
        a + 1
    }
    //лямбда описывает сигнатуру функици, если аргумент один - доступен через it

    val increment2 = { a: Int ->
        a + 1
        println("")

    }

println(findIndex("I love Kotlin", "love", true))

    val findIndex = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }

    val findIndex1: (String, String, Boolean) -> Int = { text, word, ignoreCase -> //текст, ворд - это придумываем сами. названия переменных
        text.indexOf(word, 0, ignoreCase)
    }


    val findIndex2 = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, 0, ignoreCase)
    }

}


// Обычное объявление функции
fun increment(a: Int): Int {
    return a + 1
}

//с какого индекса фразы начинается слово love
fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
    return text.indexOf(word, 0, ignoreCase)
}