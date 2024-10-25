package org.helgawolf.kotlincourse.lessonsummaries.lesson15

class Car (
    val brand: String,
    val model: String
){
    companion object{
        val brandList = listOf("Audi", "Lada")
    }

    fun sayMyName(){
        println("I am $brand $model.")
    }
}