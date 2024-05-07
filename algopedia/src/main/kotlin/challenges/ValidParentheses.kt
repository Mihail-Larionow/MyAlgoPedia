package challenges

import com.sun.jmx.remote.internal.ArrayQueue
import java.util.Deque
import java.util.Queue
import java.util.Stack

class ValidParentheses {

    fun solve(s: String): Boolean {

        val stack = Stack<Char>()

        var i = 0

        for(c in s){
            when(c){
                '(', '[', '{' -> stack.push(c)
                ')' -> if(stack.isEmpty() || stack.pop() != '(') return false
                ']' -> if(stack.isEmpty() || stack.pop() != '[') return false
                '}' -> if(stack.isEmpty() || stack.pop() != '{') return false
            }
            i++
        }

        return stack.isEmpty()
    }

}