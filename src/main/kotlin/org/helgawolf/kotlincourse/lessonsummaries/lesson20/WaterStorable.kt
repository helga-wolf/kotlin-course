package org.helgawolf.kotlincourse.lessonsummaries.lesson20

interface WaterStorable {
    val volume: Double // без равно тк не инициализируем тут

    fun fill(amount: Double)
    fun take(amount: Double)
}