class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val arr = nums.filter { it != `val` }
        for (i in arr.indices) nums[i] = arr[i]
        return arr.size
    }
}
