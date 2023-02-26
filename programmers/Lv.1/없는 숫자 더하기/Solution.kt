class Solution {
    fun solution(numbers: IntArray): Int {
        var sum = 0
        for(i in numbers){
            sum += i            
        }
        return 45 - sum
    }
}
