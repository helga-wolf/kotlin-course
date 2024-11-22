package org.helgawolf.kotlincourse.lessonsummaries.lesson23

fun main(){

    val i: Any = "dfjhjdfww"
    println( i as String)
    // println( i as Int)
     if (i is String) {
         println(i)
     } else {
         println("это не строка ептить")
     }

    if (i is Int) {
        println(i)
    } else {
        println("это не инт ахахах")
    }

    println(i as? Int) // безопасное приведение к инту

    println(i as? Int ?: "не инт")


}