package challenges

import algorithms.Kadane
import kotlin.math.max
import kotlin.math.min

class MaxProfit {

    fun solve(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        prices.forEach {
            minPrice = min(minPrice, it)
            maxProfit = max(maxProfit, it - minPrice)
        }

        return maxProfit
    }

}

