package _2023.day1

import java.io.ByteArrayInputStream
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Puzzle1Test {

    @ParameterizedTest
    @CsvSource("1abc2, 12", "pqr3stu8vwx, 38", "a1b2c3d4e5f, 15", "treb7uchet, 77")
    fun `combine number base on first digit and last digit in a text`(text: String, expectedCombinedNumber: Int) {
        //given
        //when
        val combinedNumber = Puzzle1().combineFirstAndLastDigit(text)
        //then
        assertEquals(expectedCombinedNumber, combinedNumber)
    }

    @Test
    fun `returns correct summed based on combined numbers from each line in the text file`() {
        //given
        val input = """
            1abc2
            pqr3stu8vwx
            a1b2c3d4e5f
            treb7uchet
        """.trimIndent()
        val inputBufferedReader = ByteArrayInputStream(input.toByteArray()).bufferedReader()
        //when
        val summedNumber = Puzzle1().sumCombinedNumbers(inputBufferedReader)
        //then
        assertEquals(142, summedNumber)
    }
}