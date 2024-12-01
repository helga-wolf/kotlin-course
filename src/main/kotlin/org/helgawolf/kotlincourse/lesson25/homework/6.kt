package org.helgawolf.kotlincourse.lesson25.homework

//Задание 6. Создай функцию расширение словаря из строк и чисел, которая принимает число и возвращает
// список ключей, длина которых меньше их значений но больше заданного в функции аргумента.
// В случае если список получается пустой нужно выкинуть исключение IllegalState.
//По аналогии с предыдущим заданием выполни трансформации и проверки.


fun main() {

}

fun Map<String, Int>.filterKeysByLength(minLength: Int): List<String> {
    val result = this.filter { entry ->
        entry.key.length > minLength && entry.key.length < entry.value
    }.map { it.key }

    if (result.isEmpty()) {
        throw IllegalStateException("Список пуст")
    }

    return result
}
