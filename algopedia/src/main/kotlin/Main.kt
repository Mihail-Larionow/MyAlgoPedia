import algorithms.BinarySearch

fun main(args: Array<String>) {

    val arr = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val bs = BinarySearch()

    println(bs.execute(arr, 6))
}
