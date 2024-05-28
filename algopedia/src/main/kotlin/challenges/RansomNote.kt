package challenges

class RansomNote {

    fun solve(ransomNote: String, magazine: String): Boolean {

        val chars1 = IntArray(26)
        val chars2 = IntArray(26)

        for (c in ransomNote.toCharArray()) {
            chars1[c - 'a']++
        }

        for (c in magazine.toCharArray()) {
            chars2[c - 'a']++
        }

        for (i in 0 until 26) {
            if (chars1[i] > chars2[i]) return false
        }

        return true
    }

}