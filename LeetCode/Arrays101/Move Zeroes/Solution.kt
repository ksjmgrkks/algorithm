class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        var right = 1
        //nums = [0,1,0,3,12]
        //nums = [1,2,3,0,5,3]
        while(right < nums.size){
            if(nums[left] == 0){
                if(nums[right] == 0){
                    right++ /*left = 1, right = 3 */
                }else{
                    nums[left] = nums[right]
                    nums[right] = 0
                    //nums = [1,0,0,3,12]
                    //nums = [1,3,0,0,12]
                    //nums = [1,3,12,0,0]
                    left++
                    //left = 1
                    //left = 2
                    //left = 3
                    right++
                    //right = 2
                    //right = 4
                    //right = 5
                }
            }else{
                   left++
                   //left = 1
                   //left = 2
                   //left = 3
                   right++
                   //right = 2
                   //right = 3
                   //right = 4
            }
        }
    }
}
