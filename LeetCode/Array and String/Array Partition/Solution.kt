class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        //Input: nums = [1,4,3,2]
        //Output: 4
        //먼저 정렬
        //[1,2,3,4]
        var answer = 0
        nums.sort()
        println(nums)
        nums.forEachIndexed { index, value ->
            if (index % 2 == 0)
                answer += value
        }
        return answer
    }
}
