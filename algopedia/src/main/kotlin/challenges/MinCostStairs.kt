package challenges

import kotlin.math.min

class MinCostStairs {

    fun solve(cost: IntArray): Int {

        val n = cost.size

        if(n == 0) return 0
        else if(n == 1) return cost[0]

        cost[1] = min(cost[1], cost[0] + cost[1])
        if(n == 2) return min(cost[1], cost[0])

        for(i in 2 until n) {
            cost[i] = min(cost[i - 1], cost[i - 2]) + cost[i]
        }

        return min(cost[n - 1], cost[n - 2])
    }

}