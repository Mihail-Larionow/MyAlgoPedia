package challenges

class HIndex {

    fun solve(citations: IntArray): Int {
        citations.sort()

        val n = citations.size

        var i = 0
        while(i < n && citations[n - 1 - i] > i) {
            i++
        }

        return i
    }

}