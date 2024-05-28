package challenges

class ThreeSum {

    fun solve(nums: IntArray): List<List<Int>> {

        val list = mutableListOf<List<Int>>()
        nums.sort()
        val n = nums.size
        for(i in 0 until n){
            if(i > 0 && nums[i] == nums[i-1]){
                continue
            }

            var j = i + 1
            var k = n - 1

            while(j < k){

                val s = nums[i] + nums[j] + nums[k]

                if(s > 0){
                    k--
                }
                else if(s < 0){
                    j++
                }
                else{
                    list.add(listOf(nums[i], nums[j], nums[k]))
                    j++

                    while(nums[j] == nums[j-1] && j<k){
                        j++
                    }
                }
            }

        }

        return list
    }

}