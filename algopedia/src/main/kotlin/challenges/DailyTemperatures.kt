package challenges

class DailyTemperatures {

    data class Day(val temperature: Int, val index: Int)

    fun solve(temperatures: IntArray): IntArray {

        val queue = ArrayDeque<Day>()
        var i = temperatures.size - 1

        while(i >= 0){
            val day = Day(temperature = temperatures[i], index = i)

            while(queue.isNotEmpty()){
                val dayBefore = queue.first()
                if(dayBefore.temperature > day.temperature){
                    temperatures[i] = dayBefore.index - day.index
                    break
                }
                queue.removeFirst()
            }

            if(queue.isEmpty()) temperatures[i] = 0

            queue.addFirst(day)
            i--
        }

        return temperatures
    }

}