package org.helgawolf.kotlincourse.lessonsummaries.lesson13

fun main() {

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter { it in 7..17 }
    //filter это функция
    println(filtered2)

    val numbers = listOf(-1, 2, -3, 4, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers)

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers)

    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull() // фильтр на все что не налл
    println(nonNullList)

    val firstPositive = numbers.firstOrNull { it > 0 }// вернет первое значение из списка
    println(firstPositive)

    val elementOrElse =
        numbers.getOrElse(10) { -1 }//элемент из списку по индкус, а иначе выинет исключение, если такого индекса нет в списке
    // то же что numbers[10] + исключение
    println(elementOrElse)

    //преобразование коллекций
    val incrementedNumbers: List<String> = numbers.map { "$it%" }// что угодно во что угодно
    println(incrementedNumbers)

    val numberSquareMap = numbers.associate { it to it * it }// преобр коллекцию в словарь
    println(numberSquareMap)

    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    val flattenList = multipleList.flatten()//все в одну линию в общий список
    println(flattenList)


    val flattenListAfterMapping = multipleList.flatMap { list1: List<Int> ->
        list1.map { it * 2 }
    }
    println(flattenListAfterMapping)


    val numbersString = numbers.joinToString(separator = ", ") {// сборка в строку
        "$it * $it"
    }
    println(numbersString)


    var sortedNumbers = numbers.sorted()// список в обратную сторону
    println(sortedNumbers)

    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers)
    //sortedDescending - в обратном порядке

    numbers.forEach {//перебирает весь список
        println(it)
    }

    val sumOfNumbers = numbers.sum()//сумма числовых списков
    println(sumOfNumbers)


    val averageOfNumbers = numbers.average()// считает среднее
    println(averageOfNumbers)


    val maxNumber = numbers.maxOrNull()// вернет максимальное либо налл
    println(maxNumber)


    val minNumber = numbers.minOrNull()// минимальное или налл
    println(minNumber)


    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign)

    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()// выбирает уникальные
    println(distinctNumbers)

    println(numbers.take(3))// возьмет указанное колво элементов

    println(numbers.takeLast(3))// возьмет 3 последних значения

    //println(numbers.size())// колво элтов в списке

    val numbers1 = listOf(1, 2, 3)
    //проверка что колво элтов больше 5
    if (numbers1.size > 5) {
        println("ok")
    } else println("not ok")
    //проверка, пуст ли список
        numbers1.isEmpty()
        numbers1.isNotEmpty()

    val defaultValue = numbers1.getOrElse(8){ 0 }
    println(defaultValue)

    val agesList = listOf(18, 17, 29, 31)
    println(agesList.filter { it in 18..32 })







}

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}