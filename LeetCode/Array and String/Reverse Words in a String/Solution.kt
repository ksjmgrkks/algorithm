class Solution {
    fun reverseWords(s: String): String {
        //Input: s = " asdasd df f"
        //Output: "f df  asdasdasdasd"
        //Expected: "f df asdasd"
        var answer = ""
        var left = s.length-1
        var right = s.length-1
        while(left >= 0){
            if(s[left] == ' ' && s[right] == ' '){
                if(left == 0)
                    return answer.substring(0 until answer.length-1)
                left--
                right--
            }else if(s[left] != ' ' && s[right] != ' '){
                if(left == 0 && right == 0)
                    answer += s[left]                    
                left--
            }else if(s[left] == ' ' && s[right] != ' ' && left != 0){
                for(i in left+1..right){
                    answer += s[i]
                }
                answer += " "
                right = left
            }
            if(left == 0 && right != 0){
                var startPos = 0
                if(s[left] == ' '){
                    startPos = 1
                }
                for(i in startPos..right){
                    answer += s[i]
                }
                return answer
            }
        }
        return answer
    }
}
