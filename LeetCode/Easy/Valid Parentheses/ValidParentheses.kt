class Solution {
    fun isValid(s: String): Boolean {
        //s="()[]{}"
        val stack = Stack<Char>()
        s.reversed().forEach {
            when(it){
                //1.'}' -> else이므로 stack에 push stack = }
                //2.'{' -> 3번 case이므로 stack을 pop해서 stack => empty
                //...
                '(' -> if (stack.isNotEmpty() && stack.peek() == ')') stack.pop() else stack.push(it)
                '[' -> if (stack.isNotEmpty() && stack.peek() == ']') stack.pop() else stack.push(it)
                '{' -> if (stack.isNotEmpty() && stack.peek() == '}') stack.pop() else stack.push(it)
                else -> stack.push(it)
            }
        }
        
        return stack.isEmpty()
    }
}
