package challenges

import kotlin.math.max

class HouseRobber {

    fun solve(nums: IntArray): Int {

        var maxMoney = 0
        for(i in nums.indices) {
            if(i == 2) nums[2] = nums[2] + nums[0]
            else if(i > 2) nums[i] = nums[i] + max(nums[i - 2], nums[i - 3])

            maxMoney = max(maxMoney, nums[i])
        }

        return maxMoney
    }

}