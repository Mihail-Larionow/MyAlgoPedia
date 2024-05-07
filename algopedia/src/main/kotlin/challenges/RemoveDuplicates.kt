package challenges

class RemoveDuplicates {

    fun solve(nums: IntArray): Int {

        if(nums.isEmpty()) return 0

        var i = 1
        var j = 0
        while(i < nums.size){
            if(nums[i] != nums[j]) {
                j++
                nums[j] = nums[i]
            }

            i++
        }

        return j + 1
    }

}