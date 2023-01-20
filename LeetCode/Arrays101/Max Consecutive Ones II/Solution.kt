class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var longestSequence = 0
        var left = 0
        var right = 0
        var numZeroes = 0

        // while our window is in bounds
        while (right < nums.size) {

            // add the right most element into our window
            if (nums[right] == 0) {
                numZeroes++
            }

            // if our window is invalid, contract our window
            while (numZeroes == 2) {
                if (nums[left] == 0) {
                    numZeroes--
                }
                left++
            }

            // update our longest sequence answer
            longestSequence = Math.max(longestSequence, right - left + 1)

            // expand our window
            right++
        }
        return longestSequence
    }
}
