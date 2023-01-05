class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val sumArray = IntArray(nums.size)
        
        var currentSum = 0
        //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/with-index.html
        for((index, number) in nums.withIndex()){
            currentSum += number
            sumArray[index] = currentSum
        }

        return sumArray
    }
}
