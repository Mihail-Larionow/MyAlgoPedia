package challenges

class StringCompression {

    fun solve(chars: CharArray): Int {

        var i = 0
        var c = chars[0]
        var k = 0
        var l = 0

        while(i < chars.size) {
            if(chars[i] == c) {
                l++
            }
            else{
                chars[k] = c
                c = chars[i]
                k++
                if(l > 1){
                    "$l".map{
                        chars[k] = it
                        k++
                    }
                }
                l = 1
            }
            i++
        }

        chars[k] = c
        k++
        if(l > 1){
            "$l".map{
                chars[k] = it
                k++
            }
        }

        return k
    }
}