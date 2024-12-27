package org.helgawolf.kotlincourse.lesson32.homework

import org.helgawolf.kotlincourse.lessonsummaries.lesson32.textToPhone
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class PhoneNumberFormatterTest {

    private val formatter = PhoneNumberFormatter()

    @ParameterizedTest
    @MethodSource("provideNumbers")
    fun `check formatting of number` (
        phoneNumber: String,
        expected: String
    ) {
        val actual = formatter.formatPhoneNumber(phoneNumber)
        assertEquals(expected, actual)
    }


    companion object {
        @JvmStatic
        fun provideNumbers() = listOf(
            Arguments.of("8 (922) 941-11-11", "+7 (922) 941-11-11"),
            Arguments.of("79229411111", "+7 (922) 941-11-11"),
            Arguments.of("+7 922 941 11 11", "+7 (922) 941-11-11"),
            Arguments.of("9229411111", "+7 (922) 941-11-11"),
            Arguments.of("abc +7 922 941 11 11", "+7 (922) 941-11-11")
        )

        @JvmStatic
        fun provideNinValidNumbers() = listOf(
            Arguments.of("12345"),
            Arguments.of("+1 (922) 941-11-11", "")
        )

        }
    }