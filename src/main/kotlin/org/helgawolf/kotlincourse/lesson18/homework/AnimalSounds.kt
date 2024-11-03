package org.helgawolf.kotlincourse.lesson18.homework

import org.helgawolf.kotlincourse.lessonsummaries.lesson18.printColored

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

open class Animal() {
    open fun makeSound(){
        println("This animal makes no sound")
    }
}
class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.RED}This animal says Bark!${Colors.RESET}")
    }
}
class Cat : Animal() {
    override fun makeSound() {
        println("${Colors.PURPLE}This animal says Meow!${Colors.RESET}")
    }
}
class Bird : Animal() {
    override fun makeSound() {
        println("${Colors.GREEN}This animal says Tweet!${Colors.RESET}")
    }
}

fun main(){
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())
    animals.forEach { it.makeSound() }
}