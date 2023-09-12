fun longestCommonPrefix(strs: Array<String>): String {
    var minLength = strs[0].length
    for(str in strs){
            if(str.length < minLength) minLength = str.length
        }

    var solution = ""

    for(i in 0 until minLength){
        var c = strs[0][i]
        for(str in strs){
            if(c != str[i]) return solution
        }
        solution += c
    }

    return solution
}
