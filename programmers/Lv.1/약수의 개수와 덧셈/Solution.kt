import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(i in left..right){
            if(divisorCount(i) % 2 == 0){
               answer += i 
            }else{
               answer -= i
            }            
        }
        return answer
    }
    
    //참고 링크1: https://kbw1101.tistory.com/32 
    //참고 링크2: https://onlyfor-me-blog.tistory.com/656
    fun divisorCount(number : Int) : Int {
        val sqrt = sqrt(number.toDouble())
        val result = arrayListOf<Int>()
        for(i in 1..sqrt.toInt()) {
            if(number % i == 0) {
                result.add(i)
                if(number / i != i){
                    result.add(number / i)                    
                }
            }            
        }
        return result.size        
    }
}
