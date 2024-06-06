package challenges

class Search2DMatrixTwo {

    fun solve(matrix: Array<IntArray>, target: Int): Boolean {

        val n = matrix.size
        val m = matrix[0].size

        var row = 0
        var col = m - 1

        while(row < n && col >= 0){
            val x = matrix[row][col]
            if(x == target) return true
            else if(x > target) col--
            else row++
        }

        return false
    }
}