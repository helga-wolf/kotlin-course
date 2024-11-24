package org.helgawolf.kotlincourse.lessonsummaries.lesson24

import kotlin.math.E

fun main(){
//throw Exception("ошибочка вышла")
    val exception = Exception("ошибочка вышла")
 //   throw exception

    try {
        val r = null
        r!! // не наллабл

        val w = listOf(1)
        w[2]
        //ArrayIndexOutOfBoundsException

        // Код, который может выбросить исключение
    } catch (e: NullPointerException) {
        // Обработка конкретного типа исключения
    } catch (e: Exception) {
        // Обработка всех остальных исключений
    } finally {
        // Блок, который выполняется всегда, независимо от наличия исключения
    }



//    try {
//        // Код, который может выбросить исключения
//    } catch (e: Exception) {
//        when(e) {
//            is ExceptionA, is ExceptionB -> {
//                // Обработка исключений ExceptionA или ExceptionB
//                println("Обработано исключение типа A или B")
//            }
//            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
//        }
//    }
}