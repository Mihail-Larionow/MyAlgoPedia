package challenges

class RotateArray {

    fun solve(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val arr = IntArray(k % n)

        for(i in 0 until k % n){
            arr[i] = nums[n - k % n + i]
        }

        for(i in n - k % n - 1 downTo 0){
            nums[i + k % n] = nums[i]
        }

        for(i in 0 until k % n){
            nums[i] = arr[i]
        }

    }

}