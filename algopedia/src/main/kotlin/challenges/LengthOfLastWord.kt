package challenges

class LengthOfLastWord {

    fun solve(s: String): Int {
        var n = 0
        var i = s.length - 1

        while (i >= 0 && s[i] == ' ') {
            i--
        }

        while(i >= 0 && s[i] != ' '){
            n++
            i--
        }

        return n
    }
}