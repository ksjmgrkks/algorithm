class Solution {
    fun reverseWords(s: String): String {
        //Input: s = "Let's take LeetCode contest"
        //Output: "s'teL ekat edoCteeL tsetnoc"
        var answer = ""
        val arr = s.split(" ")
        arr.forEachIndexed { index, value ->
            answer += if (index < arr.size - 1) {
                "${StringBuffer(value).reverse()} "
            } else {
                "${StringBuffer(value).reverse()}"
            }
        }
        return answer
    }
    
    fun reverseWords(s: String): String {
            var lastSpaceIndex = -1
            val charArray = s.toCharArray()
            for (i in 0..s.length) {
                if (i == s.length || charArray[i] == ' ') {
                    // Reverse here
                    var first = lastSpaceIndex + 1
                    var last =  i - 1
                    while (first < last) {
                        val temp = charArray[last]
                        charArray[last--] = charArray[first]
                        charArray[first++] = temp
                    }
                    lastSpaceIndex = i
                }

            }
            return String(charArray)
    }
    
    fun reverseWords(s: String): String {
        return s.split(' ')
            .joinToString(" ") { it.reversed() }
    }

    fun reverseWords(s: String): String =
    s.split(" ").map{ it.reversed() }.joinToString(" ")
}
