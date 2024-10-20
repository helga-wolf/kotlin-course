package org.helgawolf.kotlincourse.lesson13

fun main() {
//Отфильтровать коллекцию по диапазону 18-30

    val collection = mutableListOf(1,2,3,4,5,17,18,100,35,29,65,41)
    val filter18To30 = collection.filter { it in 18..30 }

//Выбрать числа, которые не делятся на 2 и 3 одновременно

collection.filterNot { it % 2 == 0 && it % 3 == 0}

//Очистить текстовую коллекцию от null элементов

val textCollection = mutableListOf("aaa", null, "bbb")
    val noNulls = textCollection.filterNotNull()
    println(noNulls)

//Преобразовать текстовую коллекцию в коллекцию длин слов

collection.map {"$it".length}

//Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова

    val strings = listOf("aa", "bb", "cc")
    strings.map {it to it.reversed()}

//Отсортировать список в алфавитном порядке

strings.sorted()

//Отсортировать список по убыванию

    strings.sortedDescending()

//Распечатать квадраты элементов списка

    collection.map { it * it }

//Группировать список по первой букве слов

    strings.groupBy { it.firstOrNull() }

//Очистить список от дублей

    val noDuplicates = collection.distinct()

//Взять первые 3 элемента списка

    val firstThree = collection.take(3)

//Взять последние 3 элемента списка

val lastThree = collection.takeLast(3)

}