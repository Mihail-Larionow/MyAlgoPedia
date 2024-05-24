package challenges

import kotlin.math.max
import kotlin.math.min

class MaxArea {

    fun solve(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0

        while(left < right) {
            val minHeight = min(height[right], height[left])
            val currArea = (right - left) * minHeight

            maxArea = max(maxArea, currArea)

            if(height[left] > height[right]) right--
            else left++
        }

        return maxArea
    }
}