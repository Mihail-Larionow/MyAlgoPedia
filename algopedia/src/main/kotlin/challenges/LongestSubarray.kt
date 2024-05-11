package challenges

import kotlin.math.max

class LongestSubarray {

    fun solve(nums: IntArray): Int {

        var head = 0
        var tail = 0
        var maxA = 0

        var hasZeroes = false

        var j = 0

        while(j < nums.size){
            if(nums[j] == 0){
                hasZeroes = true
                maxA = max(maxA,head + tail)
                tail = head
                head = 0
            }
            else{
                head++
            }
            j++
        }

        maxA = max(maxA,head + tail)

        return maxA + if(hasZeroes) 0 else -1
    }
}