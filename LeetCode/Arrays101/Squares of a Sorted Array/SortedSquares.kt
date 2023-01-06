class Solution {
    fun sortedSquares(nums: IntArray): IntArray = nums.map { it * it }.sorted().toIntArray()
}
