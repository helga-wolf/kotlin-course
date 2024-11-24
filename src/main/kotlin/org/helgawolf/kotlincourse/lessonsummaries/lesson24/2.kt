package org.helgawolf.kotlincourse.lessonsummaries.lesson24

fun main(){

    try {
        val i = "ouiy" as Double

    } catch (e: ClassCastException){
        println("ClassCastException")
    }

}