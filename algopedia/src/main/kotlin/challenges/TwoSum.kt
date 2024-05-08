package challenges

class TwoSum {

    fun solve(nums: IntArray, target: Int): IntArray{

        for(i in 1 until nums.size){
            for(j in i until nums.size){
                if(nums[j] + nums[j - i] == target){
                    return intArrayOf(j, j - i)
                }
            }
        }
        return intArrayOf(0,0)
    }
}