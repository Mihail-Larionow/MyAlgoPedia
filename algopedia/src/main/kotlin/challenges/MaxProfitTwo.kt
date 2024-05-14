package challenges

class MaxProfitTwo {

    fun solve(prices: IntArray): Int {
        var profit = 0

        for(i in 1 until prices.size){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i - 1]
            }
        }

        return profit
    }
}