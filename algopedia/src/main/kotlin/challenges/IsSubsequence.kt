package challenges

class IsSubsequence {

    fun solve(s: String, t: String): Boolean {

        if(s.isEmpty()) return true

        var i = 0
        var j = i

        while(i < s.length && j < t.length){
            if(s[i] == t[j]){
                i++
                if(i == s.length) return true
            }
            j++
        }

        return i == s.length
    }

}