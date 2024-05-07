package challenges

import kotlin.math.max

class ConsecutiveCharacters {

    fun solve(s: String): Int {

        if(s.isEmpty()) return 0

        var n = 1
        var k = n

        for (i in 1 ..< s.length) {
            if(s[i] == s[i-1]){
                k++
                n = max(k, n)
            }
            else{
                k = 1
            }
        }
        return n
    }

}