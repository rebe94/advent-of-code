package _2023.day1

import java.io.BufferedReader
import java.io.File

class Puzzle1 {

    companion object {
        private const val INPUT_RESOURCE_FILENAME = "day1-puzzle1-input.txt"
    }

    fun execute() {
        val inputFile = File(javaClass.classLoader.getResource(INPUT_RESOURCE_FILENAME)?.toURI()!!)
        println(sumCombinedNumbers(inputFile.bufferedReader()))
    }

    fun sumCombinedNumbers(bufferedReader: BufferedReader): Int {
        var summedNumber = 0
        bufferedReader.lines().forEach {
            summedNumber += combineFirstAndLastDigit(it)
        }
        return summedNumber
    }

    fun combineFirstAndLastDigit(text: String): Int {
        val digits = text.toCharArray().filter { it.isDigit() }
        return digits.first().toString().plus(digits.last().toString()).toInt()
    }
}