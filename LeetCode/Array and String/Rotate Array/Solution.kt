class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
         // speed up the rotation
        // Input: nums = [1,2,3,4,5,6,7], k = 3
        // Output: [5,6,7,1,2,3,4]
        // Explanation:
        // rotate 1 steps to the right: [7,1,2,3,4,5,6]
        // rotate 2 steps to the right: [6,7,1,2,3,4,5]
        // rotate 3 steps to the right: [5,6,7,1,2,3,4]
        var count = k
        count %= nums.size
        var temp: Int
        var previous: Int
        for (i in 0 until count) {
            //previous = 7
            previous = nums[nums.size - 1]
            for (j in nums.indices) {
                //temp = 1
                //tmep = 2
                temp = nums[j]
                //nums[0] = 7
                //nums[1] = 1
                nums[j] = previous
                //previous = 1
                //previous = 2
                previous = temp
            }
        }
    }
}
