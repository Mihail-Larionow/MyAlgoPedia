package challenges

class MoveZeroes {

    fun solve(nums: IntArray): Unit {

        var j = 0
        while(j < nums.size && nums[j] != 0) {
            j++
        }

        if(j == nums.size) return

        var i = j + 1
        while(i < nums.size){
            if(nums[i] != 0){
                nums[j] = nums[i]
                nums[i] = 0
                j++
            }
            i++
        }

        return
    }
}