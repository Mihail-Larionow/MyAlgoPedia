import algorithms.BinarySearch
import challenges.TwoSum

fun main(args: Array<String>) {

    val nums = readln().split(",").map { it.toInt() }.toIntArray()
    val target = readln().toInt()
    val algorithm = TwoSum()

    algorithm.solve(nums = nums,target = target).forEach {
        println(it)
    }
}
