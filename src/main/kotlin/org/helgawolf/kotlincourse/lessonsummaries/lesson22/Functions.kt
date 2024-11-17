package org.helgawolf.kotlincourse.lessonsummaries.lesson22

import org.helgawolf.kotlincourse.lessonsummaries.lesson22.extensions.removeSpaces

fun main() {
    val result = "String with spaces".removeSpaces()// импортируй!
    println(result)

    val s = listOf(1, null)
    s.isElementsNullOrEmpty()


    println("aeafd".funA("dkfjsjsss", 1))

    listOf(1, 2, 3).funB(null)

    mapOf("wisdoi" to "kshd", "sdjfh" to " wjhf").funC("sdkfhj", "sjqqwioeif")
   // val num: Map<String, Int> = mapOf("wisdoi" to 1, "sdjfh" to "2)
   //         num.funC<String, Any>("afds", true)

    val num2 = 0.9
    println(num2.funD(0.2, "tuiuy"))

    println(setOf("rrte", "dwq").funE("dfds"))

    //до 2 зн после зпт
    var number: Double = 34.2939929292
    println("%,.2f".format(number))

    // cчитаем колво сслов в строке
    val str = "aaa bbb ccc ddd"
    println(str.split(" ").size)
    println(str.wordCounter())

    var num3 = 123
    val list = listOf(num3)
    val list3 = listOf(num3, num3, num3)
    println(num3.createList(8).get(0))

}

    fun <T> List<T>.isElementsNullOrEmpty(): Boolean {
        return this.all { it == null} || this.isEmpty()
    }

fun String.funA(arg1: String,arg2: Int): Boolean{
    return true
}

fun List <Int>.funB(arg1: String?){}

fun <KEY, VAL> Map<KEY, VAL>.funC(arg1: KEY, arg2: VAL): Boolean{
    return true
}
fun Double?.funD(arg1: Double, arg2: String?): Double{
    return 0.0
}
fun <T> Set<T>.funE(arg1: T): List<T>{
    return listOf()
}

fun Double.format(): String {
    return "%,.2f".format(this)
}

fun String.wordCounter(): Int {
    return split(" ").size
}

fun <T> T.createList(n: Int): List<T>{
//    val list = mutableListOf<T>()
//
//    for (i in 0 until n){
//        list.add(this)
//    }
//    return list.toList()

    val range = 0 until n
    range.map { this }

}