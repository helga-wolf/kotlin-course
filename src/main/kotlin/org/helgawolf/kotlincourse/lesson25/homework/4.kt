package org.helgawolf.kotlincourse.lesson25.homework

//Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()

fun main() {

    //анон
    val sumOfABigNumber1 = fun (bigNumber: Long): Int{
        return (bigNumber.toString().map { it.digitToInt() }).sum()
    }

    // с типом
    val sumOfABigNumber2: (Long) -> Int = {
        it.toString().map { it.digitToInt() }.sum()
    }

    // без типа
    val sumOfABigNumber3 = { bigNumber: Long ->
        bigNumber.toString().map { it.digitToInt() }.sum()
    }

    val bigNumber = 487689375385738753

    println(sumOfABigNumber(bigNumber))
    println(sumOfABigNumber1(bigNumber))
    println(sumOfABigNumber2(bigNumber))
    println(sumOfABigNumber3(bigNumber))


}

fun sumOfABigNumber(bigNumber: Long): Int{
    return (bigNumber.toString().map { it.digitToInt() }).sum()
}