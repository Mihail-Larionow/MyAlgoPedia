package challenges

import algorithms.BoyerMooreMajorityVote

class MajorityElement {

    fun solve(nums: IntArray): Int {
        return BoyerMooreMajorityVote().execute(nums = nums)
    }

}