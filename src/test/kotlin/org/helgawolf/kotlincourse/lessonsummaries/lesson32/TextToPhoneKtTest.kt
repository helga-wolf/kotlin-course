package org.helgawolf.kotlincourse.lessonsummaries.lesson32

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TextToPhoneKtTest {

    @Test
    fun `convert to +7` () {
        val actual = textToPhone("81234567890")
        Assertions.assertEquals("+7 (123)456-78-90", actual)
    }

    @Test
    fun `no extra symbols`() {
        val actual = textToPhone("8(123)4567890 вася")
        Assertions.assertEquals("+7 (123)456-78-90", actual)
    }


    @Test
    fun `no plus symbol`() {
        val actual = textToPhone("7(123)4567890")
        Assertions.assertEquals("+7 (123)456-78-90", actual)
    }


}