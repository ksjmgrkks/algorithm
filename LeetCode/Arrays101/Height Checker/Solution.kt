class Solution {
    fun heightChecker(heights: IntArray): Int {
        var notMatch = 0
        heights.sorted().forEachIndexed { index, value ->
            if(heights[index] != value)
                notMatch++
        }
        return notMatch
    }
}
