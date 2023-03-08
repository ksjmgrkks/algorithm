class Solution {
    fun solution(s: String, n: Int): String {
        var lowerCaseMap = HashMap<Int, Char>()
        var upperCaseMap = HashMap<Int, Char>()
        var answer = ""
        
        //참고 : https://stepbystep1.tistory.com/10
        for(i in 0..25){
            lowerCaseMap[i] = ('a' + i).toChar()            
        }        
        for(i in 0..25){
            upperCaseMap[i] = ('A' + i).toChar()             
        }  
       
        for(i in 0 until s.length){
            if(s[i] != ' '){     
                if(s[i].isLowerCase()){
                    var netIndex = (lowerCaseMap.filterValues { it == s[i] }.keys.first() + n) % 26
                    answer += lowerCaseMap[netIndex]                    
                }else{
                    var netIndex = (upperCaseMap.filterValues { it == s[i] }.keys.first() + n ) % 26
                    answer += upperCaseMap[netIndex]
                }                
            }else{
                answer += ' '
            }         
        }
        
        return answer
    }
    
    //다른 풀이
    fun solution2(s: String, n: Int): String =
       s.toList().joinToString(separator = "") {
          when (it) {
              in 'A'..'Z' -> ('A'.toInt() + (it.toInt() - 'A'.toInt() + n) % ('Z' - 'A' + 1)).toChar()
              in 'a'..'z' -> ('a'.toInt() + (it.toInt() - 'a'.toInt() + n) % ('z' - 'a' + 1)).toChar()
              else -> it
          }.toString()
     }
}
