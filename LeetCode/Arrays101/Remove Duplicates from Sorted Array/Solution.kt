class Solution {
    //in-place with 공간복잡도 O(1) 풀이
    fun removeDuplicates(nums: IntArray): Int {
        var insertIndex = 1
        for (i in 1 until nums.size) {
            // 중복 요소가 있으면 다음 인덱스로 건너뜁니다.
            if (nums[i - 1] != nums[i]) {
                /* 고유한 요소를 insertIndex 인덱스에 저장하고
                   insertIndex 를 1씩 증가시킵니다. */
                nums[insertIndex] = nums[i]
                insertIndex++
            }
        }
        return insertIndex
    }
    
    //올바른 풀이 아님 공간복잡도 O(n)이면서 in-place가 아님
    fun removeDuplicates(nums: IntArray): Int {
        val arr = nums.distinct()
        arr.forEachIndexed { index, value ->
            nums[index] = value
        }
        return arr.size
    }
}
