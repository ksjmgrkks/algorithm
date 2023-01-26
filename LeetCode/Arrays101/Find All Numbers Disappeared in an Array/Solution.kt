class Solution {
    // 내 풀이
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val max = nums.size
        val arr = arrayListOf<Int>()
        for (i in 1..max) {
            if (!nums.contains(i))
                arr.add(i)
        }
        return arr
    }
    
    // 정답
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
