package challenges

class PascalsTriangle {

    fun solve(numRows: Int): List<List<Int>> {

        val list: MutableList<List<Int>> = mutableListOf()
        list.add(listOf(1))
        for (i in 1 until numRows) {
            val row = mutableListOf<Int>()
            row.add(1)
            for (j in 1 until i) {
                row.add(list[i - 1][j - 1] + list[i - 1][j])
            }
            row.add(1)
            list.add(row)
        }
        return list
    }

}