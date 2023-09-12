fun isValid(s: String): Boolean {
    var stack = ArrayList<Char>()
    
    for(i in 0 until s.length){
        val c = s[i]
        if(!(c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}'))
            continue
        else if(c == '(' || c == '[' || c == '{') 
            stack.add(c)
        else if(stack.isEmpty())
            return false
        else if((c == ')' && stack.lastOrNull() == '(') || (c == ']' && stack.lastOrNull() == '[') || (c == '}' && stack.lastOrNull() == '{'))
            stack.removeLastOrNull()
        else 
            return false
    }

    if(stack.isEmpty())
        return true

    else
        return false
}