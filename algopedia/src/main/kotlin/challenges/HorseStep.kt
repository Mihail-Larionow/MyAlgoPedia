package challenges

class HorseStep {

    fun solve(n: Int, m: Int): Int {

        val dp = Array(n) { IntArray(m) { 0 } }
        dp[n - 1][m - 1] = 1

        var i = n - 1

        while (i >= 0) {
            var j = m - 1
            while (j >= 0) {
                if (i - 2 >= 0 && j - 1 >= 0) dp[i - 2][j - 1] += dp[i][j]
                if (i - 1 >= 0 && j - 2 >= 0) dp[i - 1][j - 2] += dp[i][j]
                j--
            }

            i--

        }

        return dp[0][0]
    }

}