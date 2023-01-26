class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        for (i in nums.indices) {
            val newIndex = Math.abs(nums[i]) - 1
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1
            }
        }
        val result: MutableList<Int> = LinkedList()
        for (i in 1..nums.size) {
            if (nums[i - 1] > 0) {
                result.add(i)
            }
        }
        return result
    }
}
