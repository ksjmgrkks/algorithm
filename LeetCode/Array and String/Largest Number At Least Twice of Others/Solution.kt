class Solution {
    fun dominantIndex(nums: IntArray): Int {
        val max = nums.max()
        var index = 0
        for (i in nums.indices) {
            if (nums[i] != max!! && nums[i] * 2 > max!!)
                return -1
            if (nums[i] == max!!)
                index = i
        }
        return index
    }
}
