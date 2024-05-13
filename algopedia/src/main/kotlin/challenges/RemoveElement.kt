package challenges

class RemoveElement {

    fun solve(nums: IntArray, `val`: Int): Int {

        var j = 0
        while(j < nums.size && nums[j] != `val`) {
            j++
        }

        if(j == nums.size) return j

        var i = j + 1
        while(i < nums.size){
            if(nums[i] != `val`){
                nums[j] = nums[i]
                nums[i] = `val`
                j++
            }
            i++
        }

        return j

    }
}