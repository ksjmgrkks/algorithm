class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        //nums = [1,1,0,1,1,1]
        var max = 0
        var count = 0
        
        nums.forEach {
            when (it) {
                //it = 5
                //count = 3, max = 2
                1 -> count++
                else -> {
                    max = Math.max(count, max)
                    count = 0
                }
            }
        }

        //return 3
        return Math.max(count, max)
        
    }
}
