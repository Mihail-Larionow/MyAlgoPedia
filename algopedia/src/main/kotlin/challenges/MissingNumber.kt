package challenges

class MissingNumber {
    
    fun solve(nums: IntArray): Int {

        val x = (1 + nums.size) * nums.size / 2
        val y = nums.sum()

        return x - y
    }

}