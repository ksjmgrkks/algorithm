class Solution {
    fun removeElement1(nums: IntArray, `val`: Int): Int {
        //공간복잡도 O(n) => array를 생성했기 때문
        //문제에서 공간복잡도 O(1)에 in-place 즉, nums 그 자체에서 하는 방법으로 풀라고 조건을 주었기 때문에
        // removeElement2 방식이 맞는 풀이다.
        val arr = nums.filter { it != `val` }
        for (i in arr.indices) nums[i] = arr[i]
        return arr.size
    }
    
    //공간복잡도 O(1)
    fun removeElement2(nums: IntArray, value: Int): Int {
        //Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //Output: 5, nums = [0,1,4,0,3,_,_,_]
        var reader = 0
        var writer = 0
        var valueCount = 0
        while(nums.size-1 >= reader){
            if(nums[reader] != value){
                nums[writer] = nums[reader]
                reader++
                writer++        
            }else{
                reader++
                valueCount++
            }
        }
        return nums.size - valueCount

    }
}
