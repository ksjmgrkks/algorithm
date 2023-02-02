class Solution {
fun longestCommonPrefix(strs: Array<String>): String {
    //Input: strs = ["flower","flow"]
    //Output: "flow"
    if(strs[0].isEmpty())
        return ""
    if(strs.size == 1)
        return strs[0]    
    var index = 1
    var prefix = strs[0].first().toString() //f
    while(index <= strs[0].length){
        for(i in 1 until strs.size){
            if(strs[i].length < prefix.length || strs[i].substring(0,prefix.length) != prefix){
                return strs[0].substring(0,prefix.length-1)
            }
        }
        if(prefix.length == strs[0].length)
            return prefix
        prefix += strs[0][index]//fl
        index++
    }
    return prefix
}
}
