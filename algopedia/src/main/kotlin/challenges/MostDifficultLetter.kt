package challenges

class MostDifficultLetter {
    
    fun solve(letters: String, time: IntArray): Char {
        
        var prevTime = 0
        var maxTime = 0
        var maxLetter = letters[0]

        for(i in 0 until time.size) {
            if(time[i] - prevTime >= maxTime){ 
                maxTime = time[i] - prevTime
                maxLetter = letters[i]
            }

            prevTime = time[i]
        }
        
        return maxLetter
    }

}