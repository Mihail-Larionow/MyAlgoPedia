package challenges

class ReverseWords {

    fun solve(s: String): String {
        return s.split(" ").joinToString(" ") { it.reversed() }
    }
}