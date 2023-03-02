class Solution {
    fun solution(s: String): String {
        val charArray = s.toCharArray()
        //charArray 초기화 -> val charArray = charArrayOf('b', 'c', 'a', 'f', 'e')        
        //오름차순 -> charArray.sort()
        charArray.sortDescending()
        val sortedStr = String(charArray)
        return sortedStr
    }
    
    //char의 대소분자 여부 확인하는법
    val ch = 'A'
    if (ch.isUpperCase()) {
        println("$ch is uppercase")
    } else if (ch.isLowerCase()) {
        println("$ch is lowercase")
    } else {
        println("$ch is not a letter")
    }
}
