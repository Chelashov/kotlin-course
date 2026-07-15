package lessons.lesson31.homework

import org.example.lessons.lesson31.homework.PhoneNumberFormatter
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

class PhoneNumberFormatterTest {

    val formatter = PhoneNumberFormatter()

    @ParameterizedTest
    @MethodSource("provideValidNumbers")
    fun validNumbersFormatCorrectly(rawnumber: String, expectedNumber: String) {
        val formattedNumber = formatter.formatPhoneNumber(rawnumber)
        assertEquals(expectedNumber, formattedNumber)
    }

    @ParameterizedTest
    @ValueSource(
        strings = ["99985840306", "19885840304", "698859484848",
            "+779885840306", "898858403067", "9885840304656565", "885840306", "3232", "988584030"]
    )
    fun invalidNumbersThrowsAnExepction(rawnumber: String) {
        assertThrows(IllegalArgumentException::class.java)
        { formatter.formatPhoneNumber(rawnumber) }
    }

    @ParameterizedTest
    @MethodSource("provideNumbersWithSymbols")
    fun numbersWithSymbolsFormatCorrectly(rawnumber: String, expectedNumber: String) {
        val formattedNumber = formatter.formatPhoneNumber(rawnumber)
        assertEquals(expectedNumber, formattedNumber)
    }

    companion object {
        @JvmStatic
        fun provideValidNumbers() = listOf(
            arrayOf("79885840306", "+7 (988) 584-03-06"),
            arrayOf("89885840306", "+7 (988) 584-03-06"),
            arrayOf("9885840306", "+7 (988) 584-03-06")
        )

        @JvmStatic
        fun provideNumbersWithSymbols() = listOf(
            arrayOf("+7(988)584-03-06", "+7 (988) 584-03-06"),
            arrayOf("abc9885840306", "+7 (988) 584-03-06"),
            arrayOf("988аоао!584))03--06??*", "+7 (988) 584-03-06")
        )

    }
}