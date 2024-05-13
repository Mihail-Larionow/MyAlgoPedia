package challenges

class RemoveDuplicatesTwo {

    fun solve(nums: IntArray): Int {

        var i = 0
        var j = 0
        var k = 0

        var d = nums[0]

        while(i < nums.size){
            if(nums[i] == d){
                if(k < 2){
                    k++
                    nums[j] = nums[i]
                    j++
                }
            }
            else{
                d = nums[i]
                k = 1
                nums[j] = nums[i]
                j++
            }
            i++
        }

        return j
    }

}