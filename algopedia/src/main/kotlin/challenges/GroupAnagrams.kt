package challenges

class GroupAnagrams {

    fun solve(strs: Array<String>): List<List<String>> {

        val map = HashMap<String, MutableList<String>>()
        val res = mutableListOf<List<String>>()

        strs.forEach { word ->
            val key = word.toCharArray().sorted().joinToString("")
            map[key]?.add(word) ?: run {
                map[key] = mutableListOf(word)
            }
        }

        map.keys.forEach { key ->
            res.add(map[key]!!)
        }

        return res
    }

}