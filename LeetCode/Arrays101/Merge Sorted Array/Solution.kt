class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        /**
        nums1 = [-1,0,0,3,3,3,0,0,0]
        m = 6
        nums2 = [1,2,2]
        n = 3
        */
        val mutableList = (nums1 + nums2).toMutableList()
        //빼야 할 0의 수
        var zeroCount = nums1.size - m
        for (index in mutableList.size - 1 downTo 0) {
            if (zeroCount > 0) {
                if (mutableList[index] == 0) {
                    mutableList.removeAt(index)
                    zeroCount--
                }
            }
        }
        //mutableList = [-1, 0, 0, 3, 3, 3, 1, 2, 2]
        mutableList.sorted().forEachIndexed { index, value ->
            nums1[index] = value
        }
        //nums = [-1, 0, 0, 1, 2, 2, 3, 3, 3]
    }
}
