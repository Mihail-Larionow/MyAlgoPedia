package challenges

class SortedSquares {

    fun solve(nums: IntArray): IntArray {

        val arr = IntArray(nums.size)

        var left = 0
        var right = nums.size - 1

        var k = right

        while(left <= right){
            if(-nums[left] > nums[right]){
                arr[k] = nums[left] * nums[left]
                left++
            }
            else{
                arr[k] = nums[right] * nums[right]
                right--
            }
            k--
        }

        return arr
    }
}