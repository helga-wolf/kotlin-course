package org.helgawolf.kotlincourse.lesson18.homework

class ShoppingCart {
    private val items = mutableMapOf<Int, Int>()

    // Базовый метод добавления одного товара
    fun addToCart(itemId: Int) {
        if (items.containsKey(itemId)) {
            items[itemId] = items.getValue(itemId) + 1
        } else {
            items[itemId] = 1
        }
    }

    // Перегрузка метода для добавления нескольких единиц товара
    fun addToCart(itemId: Int, amount: Int) {
        if (amount <= 0) throw IllegalArgumentException("Количество должно быть положительным")
        if (items.containsKey(itemId)) {
            items[itemId] = items.getValue(itemId) + amount
        } else {
            items[itemId] = amount
        }
    }

    // Перегрузка метода для добавления списка товаров
    fun addToCart(itemsList: List<Int>) {
        for (itemId in itemsList) {
            addToCart(itemId)
        }
    }

    // Перегрузка метода для добавления словаря товаров
    fun addToCart(itemsMap: Map<Int, Int>) {
        for ((itemId, amount) in itemsMap) {
            if (amount > 0) {
                addToCart(itemId, amount)
            }
        }
    }

}

fun main() {
    val cart = ShoppingCart()

    // Добавляем товары различными способами
    cart.addToCart(1)
    cart.addToCart(2, 3)
    cart.addToCart(listOf(3, 4, 4))
    cart.addToCart(mapOf(5 to 2, 6 to 1))

    println(cart)
}
