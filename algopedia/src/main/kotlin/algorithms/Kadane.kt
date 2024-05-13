package algorithms

import kotlin.math.max

class Kadane {

    fun execute(arr: IntArray): Int {
        var currentSum = 0
        var maxSum = 0

        arr.forEach {
            currentSum = max(currentSum + it, it)
            maxSum = max(currentSum, maxSum)
        }

        return maxSum
    }

}