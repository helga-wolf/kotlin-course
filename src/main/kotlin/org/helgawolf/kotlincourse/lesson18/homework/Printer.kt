package org.helgawolf.kotlincourse.lesson18.homework

abstract class Printer {
    abstract fun print(text: String)
    abstract fun printText(longText: String)
}

abstract class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println(word)
        }
    }
}

import java.awt.Color

abstract class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        Color.BLACK to Color.WHITE,
        Color.RED to Color.YELLOW,
        Color.GREEN to Color.BLUE
    )

    override fun print(text: String) {
        val words = text.split(" ")

        var currentPairIndex = 0
        for (word in words) {
            val (foregroundColor, backgroundColor) = colorPairs[currentPairIndex]

            // Выводим слово с заданным цветом текста и фона
            println("$word".colored(foregroundColor, backgroundColor))

            currentPairIndex = (currentPairIndex + 1) % colorPairs.size
        }
    }
}

// Вспомогательная функция для вывода текста с нужным цветом
fun String.colored(foregroundColor: Color, backgroundColor: Color): String {
    return "\u001B[38;2;${foregroundColor.red};${foregroundColor.green};${foregroundColor.blue}m" +
            "\u001B[48;2;${backgroundColor.red};${backgroundColor.green};${backgroundColor.blue}m$this\u001B[0m"
}

fun main() {
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    val longText = """
        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    """.trimIndent()

    laserPrinter.printText(longText)
    inkjetPrinter.printText(longText)
}





