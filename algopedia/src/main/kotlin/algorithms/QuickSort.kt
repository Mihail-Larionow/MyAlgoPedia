package algorithms

class QuickSort {

    fun execute(arr: IntArray, left: Int = 0, right: Int = arr.size - 1): IntArray {
        var start = left
        var end = right

        val middle = (left + right) / 2

        while(start <= end){
            while(arr[start] < arr[middle]){
                start++
            }
            while(arr[end] > arr[middle]){
                end--
            }
            if(start <= end){
                val temp = arr[start]
                arr[start] = arr[end]
                arr[end] = temp
                start++
                end--
            }
        }

        if(left < end){
            execute(arr = arr, left = left, right = end)
        }
        if(start < right){
            execute(arr = arr, left = start, right = right)
        }

        return arr
    }

}