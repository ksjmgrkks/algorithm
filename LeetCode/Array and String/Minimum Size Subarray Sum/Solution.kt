class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left = 0
        //최소값을 구할 땐 Integer.MAX_VALUE
        //최대값을 구할 땐 Integer.MIN_VALUE
        var result = Integer.MAX_VALUE
        var sum = 0
        for(right in 0 until nums.size){
            //nums = [2,3,1,2,4,3]
            sum += nums[right]
            while(sum >= target){
                result = minOf(result, right-left+1)
                sum -= nums[left]
                left++
            }
        }
        return if(result != Integer.MAX_VALUE) result else 0
    }
}
