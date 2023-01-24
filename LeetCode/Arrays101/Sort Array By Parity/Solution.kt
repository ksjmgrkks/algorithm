class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var left = 0
        var right = 1
        //nums = [3,1,2,4]
        while(right < nums.size){
            if(nums[left] % 2 != 0){
                if(nums[right] % 2 != 0){
                    right++/*left = 0, right = 2 */
                }else{
                    var temp = nums[left]
                    nums[left] = nums[right]
                    nums[right] = temp
                    left++
                    right++
                    //nums = [2,1,3,4]
                    //nums = [2,4,3,1]
                    //left = 1, right = 3
                    //left = 2, right = 4
                }
            }else{
                left++
                right++
            }
        }
        return nums
    }
}
