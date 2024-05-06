package challenges

class ValidPalindrome {

    fun solve(s: String): Boolean {
        val str = s.lowercase().filter { !it.isWhitespace() }.filter { it.isLetterOrDigit() }

        var left = 0
        var right = str.length - 1

        while(left <= right){
            if(str[left] != str[right]) return false
            left++
            right--
        }

        return true
    }

}