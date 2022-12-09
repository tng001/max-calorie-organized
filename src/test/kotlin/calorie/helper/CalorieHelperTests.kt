package calorie.helper

import calorie.model.Calorie
import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class CalorieHelperTests {

    @Test
    fun GivenListOfCaloriesForEachElfFromExample_WhenGetSumOfCaloriesForElfWithMostCalories_ThenBiggestCalorieSumForElfWithMostCaloriesIsReturned() {
        val listOfElfCalories = listOf(
            Calorie(BigInteger.valueOf(1000)),
            Calorie(BigInteger.valueOf(2000)),
            Calorie(BigInteger.valueOf(3000)),
            null,
            Calorie(BigInteger.valueOf(4000)),
            null,
            Calorie(BigInteger.valueOf(5000)),
            Calorie(BigInteger.valueOf(6000)),
            null,
            Calorie(BigInteger.valueOf(7000)),
            Calorie(BigInteger.valueOf(8000)),
            Calorie(BigInteger.valueOf(9000)),
            null,
            Calorie(BigInteger.valueOf(10000)),
        )

        val result = CalorieHelper.getSumOfCaloriesForElfWithMostCalories(listOfElfCalories)

        assertEquals(BigInteger.valueOf(24000), result)
    }

    @Test
    fun GivenListOfCaloriesForTwoElfFromExample_WhenGetSumOfCaloriesForElfWithMostCalories_ThenBiggestCalorieSumForElfWithMostCaloriesIsReturned() {
        val listOfElfCalories = listOf(
            Calorie(BigInteger.valueOf(1000)),
            Calorie(BigInteger.valueOf(2000)),
            Calorie(BigInteger.valueOf(3000)),
            null,
            Calorie(BigInteger.valueOf(50000)),
        )

        val result = CalorieHelper.getSumOfCaloriesForElfWithMostCalories(listOfElfCalories)

        assertEquals(BigInteger.valueOf(50000), result)
    }

    @Test
    fun GivenListOfCaloriesForEachElfFromExample_WhenGetSumOfCaloriesForThreeElfWithMostCalories_ThenBiggestCalorieSumForElfWithMostCaloriesIsReturned() {
        val listOfElfCalories = listOf(
            Calorie(BigInteger.valueOf(1000)),
            Calorie(BigInteger.valueOf(2000)),
            Calorie(BigInteger.valueOf(3000)),
            null,
            Calorie(BigInteger.valueOf(4000)),
            null,
            Calorie(BigInteger.valueOf(5000)),
            Calorie(BigInteger.valueOf(6000)),
            null,
            Calorie(BigInteger.valueOf(7000)),
            Calorie(BigInteger.valueOf(8000)),
            Calorie(BigInteger.valueOf(9000)),
            null,
            Calorie(BigInteger.valueOf(10000)),
        )

        val result = CalorieHelper.getSumOfCaloriesForThreeElfWithMostCalories(listOfElfCalories)

        assertEquals(BigInteger.valueOf(45000), result)
    }

    @Test
    fun GivenEmptyListOfCaloriesForEachElf_WhenGetSumOfCaloriesForElfWithMostCalories_ThenBigIntegerNullIsReturned() {
        val listOfElfCalories = emptyList<Calorie>()

        val result = CalorieHelper.getSumOfCaloriesForElfWithMostCalories(listOfElfCalories)

        assertEquals(BigInteger.ZERO, result)
    }

    @Test
    fun GivenEmptyListOfCaloriesForEachElf_WhenGetSumOfCaloriesForThreeElfWithMostCalories_ThenBigIntegerNullIsReturned() {
        val listOfElfCalories = emptyList<Calorie>()

        val result = CalorieHelper.getSumOfCaloriesForThreeElfWithMostCalories(listOfElfCalories)

        assertEquals(BigInteger.ZERO, result)
    }

    @Test
    fun GivenNull_WhenGetSumOfCaloriesForElfWithMostCalories_ThenBigIntegerNullIsReturned() {
        val listOfElfCalories = null

        val result = CalorieHelper.getSumOfCaloriesForElfWithMostCalories(listOfElfCalories)

        assertEquals(BigInteger.ZERO, result)
    }

    @Test
    fun GivenNull_WhenGetSumOfCaloriesForThreeElfWithMostCalories_ThenBigIntegerNullIsReturned() {
        val listOfElfCalories = null

        val result = CalorieHelper.getSumOfCaloriesForThreeElfWithMostCalories(listOfElfCalories)

        assertEquals(BigInteger.ZERO, result)
    }
}
