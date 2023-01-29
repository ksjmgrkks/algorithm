class Solution {
    fun strStr(haystack: String, needle: String): Int {
        //"mississippi"
        //"issip"
        if (haystack.contains(needle)) {
            for (i in haystack.indices) {
                if (needle[0] == haystack[i])
                    if (i + needle.length <= haystack.length) {
                        var temp = ""
                        for (j in i until i + needle.length) {
                            temp += haystack[j]
                        }
                        if (temp == needle)
                            return i
                    }
            }
        }
        return -1
    }
}
