class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum = 0
        for(i in absolutes.indices){
            if(signs[i]){
                sum += absolutes[i]                
            }else{
                sum -= absolutes[i]                
            }            
        }
        return sum
    }
}
