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
            println(it.toString())
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

        return biggestSumOfCalories
    }

    private fun getBiggestSum(biggestSumOfCalories: BigInteger, currentSumOfCalories: BigInteger): BigInteger {
        return biggestSumOfCalories.max(currentSumOfCalories)
    }
}
