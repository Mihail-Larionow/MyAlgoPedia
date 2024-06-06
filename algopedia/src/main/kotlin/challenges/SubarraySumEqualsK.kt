package challenges

class SubarraySumEqualsK {

    fun solve(nums: IntArray, k: Int): Int {

        val hm = HashMap<Int, Int>()
        var s = 0
        var res = 0

        hm[0] = 1

        nums.forEach { x ->
            s += x
            hm[s - k]?.let { res += it }

            if(hm[s] == null) hm[s] = 1
            else hm[s] = hm[s]!! + 1

        }

        return res
    }

}