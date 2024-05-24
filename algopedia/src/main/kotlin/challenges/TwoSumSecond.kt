package challenges

class TwoSumSecond {

    fun solve(numbers: IntArray, target: Int): IntArray {

        var i = 0
        var j = numbers.size - 1

        while(i < j){
            val a = numbers[i]
            val b = numbers[j]
            if(a + b == target) {
                return intArrayOf(i + 1, j + 1)
            }
            else if(a + b > target) {
                j--
            }
            else if(a + b < target){
                i++
            }

        }

        return intArrayOf(0,0)
    }

}