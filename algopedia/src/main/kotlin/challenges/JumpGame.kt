package challenges

import kotlin.math.max

class JumpGame(){

    fun solve(nums: IntArray): Boolean {
        var r = 0
        var i = 0

        while(i <= r && i < nums.size) {
            r = max(r, i+nums[i])
            i++
        }

        return i == nums.size
    }


}