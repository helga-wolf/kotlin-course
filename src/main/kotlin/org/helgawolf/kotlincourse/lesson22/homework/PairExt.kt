package org.helgawolf.kotlincourse.lesson22.homework

//Реализуйте метод расширения revert для класса Pair, который меняет местами первый и второй элементы пары. Метод должен возвращать новую пару с перевернутыми элементами. Протестируйте эту функцию на различных парах значений, в том числе null.
fun <T> Pair<T, T?>.revert(): Pair<T?, T> {
    return second to first
}
