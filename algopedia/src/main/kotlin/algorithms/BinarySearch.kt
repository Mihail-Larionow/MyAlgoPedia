package algorithms

class BinarySearch {

    fun execute(arr: List<Int>, value: Int): Int{
        var start = 0
        var end = arr.size - 1

        while(start <= end){
            val middle = (start + end) / 2

            when{
                arr[middle] == value -> return middle
                arr[middle] < value -> start = middle + 1
                else -> end = middle - 1
            }
        }

        return -1
    }
}