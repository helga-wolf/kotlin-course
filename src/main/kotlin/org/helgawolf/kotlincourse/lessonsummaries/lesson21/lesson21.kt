//package org.helgawolf.kotlincourse.lessonsummaries.lesson21
//
////дженерик позволяет писатькод, пригодный для работы с разными типами данных
//// как коробка, куда можно положить как ябооки так и апельсины. она не знает что внутри, но она хранит фрукты
////где коробка это например список, созадается без понимания что в ней будет
////дженерик на этапе написания окгда заявляет, что эта коробка бюудет хранить апельсины. хотя коробка не проектировалась именно под апельчины
////а потом можем сказать что там будут книги
//
//
//class BoxAny(private val item: Any) {
//    fun getItem(): Any {
//        return item
//    }
//}
//
//class Box<T>(val item: T) {
//    fun getItem(): T {
//        return item
//    }
//}
//
//fun main() {
//    val appleBoxAny = BoxAny("Apple")
//    val intBoxAny = BoxAny(42)
//
//    println("В коробке: ${appleBoxAny.getItem()}") // В коробке: Apple
//    println("В коробке: ${intBoxAny.getItem()}")   // В коробке: 42
//    printItem("Hello")    // Элемент: Hello
//    printItem(123)         // Элемент: 123
//    printItem(3.14)        // Элемент: 3.14
//
//    appleBoxAny.getItem()
//}
//
//fun <T> printItem(item: T) {
//    println("Элемент: $item")
//}
//
//
//fun <T: Number> sum(a: T, b: T): Double {
//    return a.toDouble() + b.toDouble()
//}
//
//class GenericIterator<T : Number, R : Iterable<T>>(
//    private val argument: T,
//    private val elements: R
//) {
//
//    fun getA(): Number {
//        return argument
//    }
//
//    fun printElements() {
//        for (e in elements) {
//            println(
//                e.toString()
//                    .repeat(argument.toInt())
//            )
//        }
//    }
//}
