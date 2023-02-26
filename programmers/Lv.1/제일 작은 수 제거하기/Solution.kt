class Solution {
    fun solution(arr: IntArray): IntArray {
        //최솟값 구하기
        var min = Int.MAX_VALUE
        for (i in arr) {
            min = if (min > i) i else min
        }
        return if (arr.size == 1) intArrayOf(-1) else arr.filter { it != min }.toIntArray()
    }
}
