package org.helgawolf.kotlincourse.lessonsummaries.lesson31

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    fun `возвращает 5 при сложении 2 и 3`() {
        val calc = Calculator()
        val actual = calc.plus(2, 3)
        //ассершенс это класс ггде есть наборы проверок, кот доступны без создания объекта класса
        Assertions.assertEquals(actual, 5)
    }
}