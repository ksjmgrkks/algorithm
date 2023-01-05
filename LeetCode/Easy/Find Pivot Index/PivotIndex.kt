class Solution {
    fun pivotIndex(nums: IntArray): Int {
        //nums = [1,7,3,6,5,6]
        //sum = 1+7+3+6+5+6
        val sum = nums.sum()
        var prefixSum = 0
        for(i in 0 until nums.size) {
            //i = 3
            if(prefixSum == sum - (nums[i] + prefixSum)){
                //1+7+3 == 1+7+3+6+5+6 - (6 + 1+7+3)
                return i
            }
            prefixSum += nums[i]
        }
        return -1        
    }
}
