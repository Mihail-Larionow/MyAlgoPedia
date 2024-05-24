package challenges

import kotlin.math.max
import kotlin.math.min

class CoinChange {

    fun solve(coins: IntArray, amount: Int): Int {

        val dp = IntArray(amount + 1) { Int.MAX_VALUE }
        dp[0] = 0

        coins.forEach {
            for (i in it..amount) {
                if (dp[i - it] != Int.MAX_VALUE) {
                    dp[i] = min(dp[i], dp[i - it] + 1)
                }
            }
        }

        return if (dp[amount] != Int.MAX_VALUE) dp[amount] else -1
    }

}