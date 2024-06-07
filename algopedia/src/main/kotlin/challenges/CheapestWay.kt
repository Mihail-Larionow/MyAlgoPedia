package challenges

import kotlin.math.min

class CheapestWay {

    fun solve(arr: Array<IntArray>, n: Int, m: Int): Int{

        var j = 0

        while (j < m) {
            var i = 0
            while (i < n) {
                if(j == 0 && i == 0) arr[i][j] = arr[i][j]
                else if(j == 0) arr[i][j] = arr[i - 1][j] + arr[i][j]
                else if(i == 0) arr[i][j] = arr[i][j - 1] + arr[i][j]
                else arr[i][j] = min(arr[i - 1][j], arr[i][j -1 ]) + arr[i][j]
                i++
            }

            j++
        }

        return arr[n - 1][m - 1]
    }
}