package challenges

class ClimbingStairs {

    fun solve(n: Int): Int {

        if (n <= 3) {
            return n
        }

        val dp = IntArray(size = n + 1)

        dp[0] = 0
        dp[1] = 1
        dp[2] = 2

        (3 .. n).forEach{
            dp[it] = dp[it - 1] + dp[it - 2]
        }

        return dp[n]
    }
}