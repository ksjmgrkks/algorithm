class Solution {
    fun solution(s: String): String {
        //예외처리
        if(s.length == 1 || s.length == 2)
            return s
        
        if(s.length % 2 == 0){
            //길이가 짝수일 때
            val preChar = s[(s.length / 2) - 1] 
            val char = s[s.length / 2]
            return "" + preChar + char 
        }else{
            //길이가 홀수일 때
            return s[s.length / 2].toString() 
        }
    }
}
