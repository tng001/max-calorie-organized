package calorie.helper

import calorie.model.Calorie
import java.math.BigInteger

object CalorieHelper {

    fun getSumOfCaloriesForElfWithMostCalories(listOfElfCalories: List<Calorie?>?): BigInteger {
        if (listOfElfCalories.isNullOrEmpty()) return BigInteger.ZERO
        if (!listOfElfCalories.contains(null)) return listOfElfCalories.sumOf { it!!.value }

        var biggestSumOfCalories = BigInteger.ZERO
        var currentSumOfCalories = BigInteger.ZERO

        listOfElfCalories.forEach {
            when (it) {
                null -> {
                    biggestSumOfCalories = getBiggestSum(biggestSumOfCalories, currentSumOfCalories)
                    currentSumOfCalories = BigInteger.ZERO
                }
                else -> {
                    currentSumOfCalories = currentSumOfCalories.add(it.value)
                }
            }
        }

        return getBiggestSum(biggestSumOfCalories, currentSumOfCalories)
    }

    fun getSumOfCaloriesForThreeElfWithMostCalories(listOfElfCalories: List<Calorie?>?): BigInteger {
        if (listOfElfCalories.isNullOrEmpty()) return BigInteger.ZERO
        if (!listOfElfCalories.contains(null)) return listOfElfCalories.sumOf { it!!.value }

        var currentSumOfCalories = BigInteger.ZERO
        val sumOfCalories: ArrayList<BigInteger> = arrayListOf()

        listOfElfCalories.forEach {
            currentSumOfCalories = when (it) {
                null -> {
                    sumOfCalories.add(currentSumOfCalories)
                    BigInteger.ZERO
                }
                else -> {
                    currentSumOfCalories.add(it.value)
                }
            }
        }

        // handle the case when the list not ends with a null
        sumOfCalories.add(currentSumOfCalories)

        return getSumOfThreeBiggestCalorie(sumOfCalories)
    }

    private fun getBiggestSum(biggestSumOfCalories: BigInteger, currentSumOfCalories: BigInteger): BigInteger {
        return biggestSumOfCalories.max(currentSumOfCalories)
    }

    private fun getSumOfThreeBiggestCalorie(sumOfCalories: ArrayList<BigInteger>): BigInteger {
        sumOfCalories.sortDescending()

        var firstThreeSum = BigInteger.ZERO
        sumOfCalories.take(3)
            .forEach { firstThreeSum = firstThreeSum.add(it) }

        return firstThreeSum
    }
}
