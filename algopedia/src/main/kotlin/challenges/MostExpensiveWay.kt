package challenges

import kotlin.math.min

class MostExpensiveWay {

    fun solve(arr: Array<IntArray>, n: Int, m: Int): Pair<Int, String> {

        val path = Array(n) { Array(m) { "" } }
        var j = 0

        while (j < m) {
            var i = 0
            while (i < n) {
                if(j == 0 && i == 0) arr[i][j] = arr[i][j]
                else if(j == 0 && i == 1) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j]
                    path[i][j] = path[i - 1][j] + "D"
                }
                else if(j == 1 && i == 0) {
                    arr[i][j] = arr[i][j - 1] + arr[i][j]
                    path[i][j] = path[i][j - 1] + "R"
                }
                else if(j == 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j]
                    path[i][j] = path[i - 1][j] + " D"
                }
                else if(i == 0 || arr[i - 1][j] < arr[i][j - 1]) {
                    arr[i][j] = arr[i][j - 1] + arr[i][j]
                    path[i][j] = path[i][j - 1] + " R"
                }
                else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j]
                    path[i][j] = path[i - 1][j] + " D"
                } 

                i++
            }

            j++
        }

        return Pair(arr[n - 1][m - 1], path[n - 1][m - 1])
    }
    
}