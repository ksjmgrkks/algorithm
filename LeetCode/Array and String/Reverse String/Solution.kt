class Solution {
    fun reverseString(s: CharArray): Unit {
        //Input: s = ["h","e","l","l","o","o"]
        //Output: ["o","o","l","l","e","h"]
        var left = 0
        var right = s.size - 1
        while(left < s.size / 2){
            val tempChar = s[left]
            s[left] = s[right]
            s[right] = tempChar
            left++
            right--
        }
    }
}
