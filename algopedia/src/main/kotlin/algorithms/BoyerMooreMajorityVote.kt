package algorithms

class BoyerMooreMajorityVote {

    fun execute(nums: IntArray): Int {
        var number = -1
        var k = 0

        nums.forEach {
            if(k == 0){
                number = it
                k = 1
            }
            else if(it == number){
                k++
            }
            else{
                k--
            }
        }

        return if(k > 0) number else -1
    }

}