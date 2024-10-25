package org.helgawolf.kotlincourse.lessonsummaries.lesson15

class Person (
    val name: String,
    val age: Int
){ // поля класса

    private var isAlive = true // по умолчанию будет тру
    //метод класса
    fun sayHello() {
        println("Hello, my name is $name and I'm $age years old")
    }

    fun die(){
        isAlive = false
    }
}