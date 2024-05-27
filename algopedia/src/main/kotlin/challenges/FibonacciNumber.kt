package challenges

class FibonacciNumber {

    fun solve(n: Int): Int {

        val dp = IntArray(n + 1)

        if(n == 0 || n == 1) return n

        dp[0] = 0
        dp[1] = 1
        dp[2] = 1

        for(i in 3..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[n]
    }

}