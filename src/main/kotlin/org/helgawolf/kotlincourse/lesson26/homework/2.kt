package org.helgawolf.kotlincourse.lesson26.homework

//Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки, удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть результат фильтрации исходного списка строк.

fun filterStrings (
    listStr: List<String>,
    filterFun: (String) -> Boolean
): List<String> {
    return listStr.filter(filterFun)
}

//Создайте функцию applyToNumbers, которая принимает список чисел и функцию, преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число). Функция должна вернуть результат преобразования исходного списка чисел.

fun applyToNumbers(
    numList: List<Number>,
    transformFun: (Number) -> Number
): List<Number> {
    return numList.map(transformFun)
}

//Реализуйте функцию sumByCondition, которая принимает список чисел и функцию, определяющую условие для включения числа в сумму. Функция должна вернуть сумму чисел, прошедших проверку.

fun sumByCondition(
    numList: List<Int>,
    checkFun: (Int) -> Boolean
): Int {
    return numList.filter(checkFun).sum()
}

//Напишите функцию combineAndTransform, которая принимает две коллекции одного типа и функцию для их объединения и преобразования в одну коллекцию другого типа. Функция должна вернуть результат преобразования (коллекцию второго типа)
//
//⚡ Для последних четырёх заданий сделать минимум по две разные реализации лямбда функций и проверить работу на разных наборах данных

fun <T> combineTransform(
    col1: List<T>,
    col2: List<T>,
    funUnion: (List<T>, List<T>) -> Set<T>
): Set<T> {
    return funUnion(col1, col2)
}

fun<T,K> combineTransform1(
    col1: List<T>,
    col2: List<T>,
    funUnion: (List<T>, List<T>,) -> List<K>
): List<K> {
    return funUnion(col1, col2)
}

fun <T, K, L: Collection<T>, M: Collection<K>> combineTransform2(
    col1: L,
    col2: L,
    funUnion: (L,L) -> M
): M {
    val sum = col2 + col2
    return funUnion(col1, col2)
}


fun main() {
    val filterLower:(String) -> Boolean = {
        it == it.lowercase() && it.isNotEmpty()
    }
    val filterPerfectSize: (String) -> Boolean = {
        it.length % 2 == 0 && it.isNotEmpty()
    }

    val testData11 = listOf("riud", "dkjdkj", "sdhsjhd", "EEE", "")
    val testData12 = listOf("grgr", "8ygdppp", "oggeerweqj")

    println("$testData11 : ${filterStrings(testData11, filterLower)}")
    println("$testData12 : ${filterStrings(testData12, filterLower)}")

    println("$testData11 : ${filterStrings(testData11, filterPerfectSize)}")
    println("$testData12 : ${filterStrings(testData12, filterPerfectSize)}")

    val transformNegative: (Number) -> Number = {
        when (it) {
            is Int -> -1 * it
            is Long -> -1 * it
            is Double -> -1 * it
            is Float -> -1 * it
            is Byte -> -1 * it
            is Short -> -1 * it
            else -> 0
        }
    }

    val transformIncreaseTenfold: (Number) -> Number = {
        when (it) {
            is Int -> 10 * it
            is Long -> 10 * it
            is Double -> 10 * it
            is Float -> 10 * it
            is Byte -> 10 * it
            is Short -> 10 * it
            else -> 0
        }
    }


    val list = listOf(1, 2, 3, 4, 5)

// Лямбда-функция для проверки четного числа
    val isEven: (Int) -> Boolean = { it % 2 == 0 }

    val result = sumByCondition(list, isEven)
    println("Сумма четных чисел: $result")


    val list2 = listOf(-2, -1, 0, 1, 2)

// Лямбда-функция для проверки числа больше нуля
    val isGreaterThanZero: (Int) -> Boolean = { it > 0 }

    val result2 = sumByCondition(list, isGreaterThanZero)
    println("Сумма положительных чисел: $result") // Вывод: Сумма положительных чисел: 3


}