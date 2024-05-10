import challenges.MaxDistToClosest

fun main(args: Array<String>) {

    val arr = readln().split(",").map { it.toInt() }.toIntArray()
    val algorithm = MaxDistToClosest()

    val res = algorithm.solve(seats = arr)
    println(res)
}
