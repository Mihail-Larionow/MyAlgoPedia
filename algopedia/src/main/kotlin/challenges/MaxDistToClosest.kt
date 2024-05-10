package challenges

import kotlin.math.max

class MaxDistToClosest {

    fun solve(seats: IntArray): Int {

        var j = 0
        while(seats[j] != 1){
            j++
        }

        var maxDist = j
        var i = j
        while(j < seats.size){
            if(seats[j] == 1){
                maxDist = max(a = maxDist, b = (j-i)/2)
                i = j
            }
            j++
        }

        maxDist = max(a = maxDist, b = j-i-1)
        return maxDist
    }
}