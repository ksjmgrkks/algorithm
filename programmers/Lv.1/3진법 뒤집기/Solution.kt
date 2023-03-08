class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        decimalToTriad(n).forEachIndexed { i, v ->
            val digit = v.toString().toInt()
            val power = Math.pow(3.0, i.toDouble()).toInt()            
            answer += digit * power
        }        
        return answer
    }

    fun decimalToTriad(decimal : Int): String {
        var triad = ""
        var num = decimal
        while (num > 0) {
            val remainder = num % 3
            triad = "${remainder}${triad}"
            num /= 3            
        }
        return triad
    }
    
    //다른 풀이
    fun solution(n: Int): Int {
        return n.toString(3).reversed().toInt(3)
    }
}
