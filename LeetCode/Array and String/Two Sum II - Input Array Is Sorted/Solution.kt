class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        //Input: numbers = [2,7,11,15], target = 9
        //Output: [1,2]
        //Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
        var left = 0
        var right = 1
        while(left < numbers.size-1){
            if(numbers[left] + numbers[right] == target){
                return intArrayOf(left+1, right+1)
            }
            if(right == numbers.size-1){
                left++
                right = left + 1
            }else{
                right++
            }
        }
        return intArrayOf()
    }
    
    //시간 복잡도 최소화 답안
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        //non-decreasing order라는 조건을 이용해야한다.
        var i = 0
        var j = numbers.size - 1
        while(i < j) {
            //조건에 맞으면 해당 값을 리턴한다.
            if (numbers[i] + numbers[j] == target) return intArrayOf(i+1,j+1)
            //두 요소의 합이 target보다 작으면 값이 커져야하므로 왼쪽 포인터를 증가시킨다.
            else if (numbers[i] + numbers[j] < target) i++
            //두 요소의 합이 target보다 크면 값이 작아져야하므로 오른쪽 포인터를 감소시킨다.
            else j--
        }
        return intArrayOf(0,0)
    }
}
