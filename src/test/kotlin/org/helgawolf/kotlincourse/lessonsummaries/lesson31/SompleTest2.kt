package org.helgawolf.kotlincourse.lessonsummaries.lesson31

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SompleTest2 {
    lateinit var list: MutableList<String>

    @BeforeEach
    fun setup() {
        list = mutableListOf("1", "2")
    }

    @Test
    fun forTest(){
        list.add("3")
       // Assertions.assertTrue(list.contains("3"))
        //либо
    // Assertions.assertTrue(list[2] == "3")
        Assertions.assertEquals("3", list[2])
    }
}