package org.helgawolf.kotlincourse.lesson22.homework

//Реализуйте функцию-расширение для класса словаря допускающего null с ключами дженериком и значениями типа список из такого же дженерика, которая принимает один аргумент типа число и возвращает словарь допускающий null с ключами типа строка и значениями типа дженерика допускающего null.

fun <K, V> Map<K, List<V>>?.filterBySize(size: Int): Map<String, List<V>>? {
    if (this == null || this.isEmpty()) return null

    return this.filterValues { it.size >= size }.mapKeys { (key, _) ->
        key.toString()
    }
}

