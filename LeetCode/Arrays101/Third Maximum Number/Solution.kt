class Solution {
    fun thirdMax(nums: IntArray): Int {
        var count = 0
        val arr = nums.sortedDescending() //내림차순으로 정렬
        
        for (i in arr.indices) {
            if (i + 1 == arr.size) {
                //마지막 요소일 땐 count를 증가시켜줌
                //중복 체크는 밑의 else에서 해줌
                    count++
            } else {
                //다음 인덱스의 값이 같지 않을때만 count 증가(중복체크)
                if (arr[i] != arr[i + 1])
                    count++
            }
            //중복을 제외하고 3번째 큰 요소를 리턴
            if (count == 3)
                return arr[i]
        }
        //3번째 큰 요소가 없다면 최대값 리턴
        return arr[0]
    }
}
