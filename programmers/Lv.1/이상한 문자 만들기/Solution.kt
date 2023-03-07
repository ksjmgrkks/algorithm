class Solution {
    fun solution(s: String): String {
        var answer = ""
        val charArray = s.toCharArray()
        var isOdd = false
        for(i in charArray.indices){
            if(charArray[i] != ' ') {
                if(isOdd){
                    answer += charArray[i].toLowerCase()
                    isOdd = false                    
                }else{
                    answer += charArray[i].toUpperCase()
                    isOdd = true
                }  
            }else{
                answer += ' '
                isOdd = false
            }            
        }        
        return answer
    }
}
