package challenges

class JewelsAndStones {

    fun solve(jewels: String, stones: String): Int {
        return stones.count { it in jewels }
    }

}