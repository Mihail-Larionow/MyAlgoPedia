package challenges

class SummaryRanges {

    fun solve(nums: IntArray): List<String> {

        if(nums.isEmpty()) return emptyList()

        val list = mutableListOf<String>()
        var left = 0
        var right = 0

        while(right < nums.size - 1) {
            if(nums[right] + 1 < nums[right + 1]){
                if(left == right) list.add("${nums[left]}")
                else list.add("${nums[left]}->${nums[right]}")
                left = right + 1
            }
            right++
        }

        if(left == right) list.add("${nums[left]}")
        else list.add("${nums[left]}->${nums[right]}")

        return list
    }

}