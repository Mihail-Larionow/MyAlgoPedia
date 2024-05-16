package challenges

class LongestCommonPrefix {

    fun solve(strs: Array<String>): String {

        var s = ""
        if(strs.isEmpty()) return s

        for(i in 0 until strs[0].length) {
            val c = strs[0][i]
            for(j in 1 until strs.size) {
                if(i >= strs[j].length || strs[j][i] != c) {
                    return s
                }
            }
            s += c
        }

        return s
    }

}