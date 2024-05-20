package challenges

import kotlin.math.max
import kotlin.math.min

class LineReflection {

    fun solve(points: List<List<Int>>): Boolean{
        var maxX = Int.MIN_VALUE
        var minX = Int.MAX_VALUE
        val set = HashSet<List<Int>>()

        points.forEach {
            minX = min(minX, it[0])
            maxX = max(maxX, it[0])
            set.add(it)
        }

        val line = minX + maxX
        points.forEach {
            if(!set.contains(listOf(line - it[0], it[1]))) return false
        }

        return true
    }
}