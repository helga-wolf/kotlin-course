package org.helgawolf.kotlincourse.lessonsummaries.lesson32

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class TextToPhoneKtTestParam {

    @ParameterizedTest
    @MethodSource("providePhoneNumbers")
    fun `check convertation`(
        phoneNumber: String,
        expected: String
    ) {
        val actual = textToPhone(phoneNumber)
        assertEquals(expected, actual)
    }


    companion object {
        @JvmStatic
        fun providePhoneNumbers() = listOf(
            Arguments.of("81234567890", "+7 (123) 456-78-90"),
            Arguments.of("8(123)4567890 вася", "+7 (123)456-78-90"),
            Arguments.of("7(123)4567890", "+7 (123)456-78-90")
        )
    }
}