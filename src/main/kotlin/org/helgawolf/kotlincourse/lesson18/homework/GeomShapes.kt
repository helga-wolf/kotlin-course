package org.helgawolf.kotlincourse.lesson18.homework


abstract class Shape() {
    open fun area(): Double {
        return 0.0
    }
}
class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val angle: Double
) : Shape() {
    override fun area(): Double{
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angle))
    }
}

fun main() {
    val shapes = listOf(
        Circle(6.9),
        Square(4.7),
        Triangle(4.7, 5.2, 60.0)
    )
    shapes.forEach {println(it.area())}
}