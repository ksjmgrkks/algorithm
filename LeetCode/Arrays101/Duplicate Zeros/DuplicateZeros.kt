class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        //arr = [1,0,2,3,0,4,5,0]
        //count(복제해야하는 0의 개수) = 3, arr.size = 8
        var count = arr.count { it == 0 }
        for (i in arr.size - 1 downTo 0) {
            if (i + count <= arr.size - 1) {
                /*해당 포지션 + 복제해야하는 0의 개수 <= 배열의 길이
                  일때만 자리를 옮기는 연산 수행*/
                //i = 5
                //arr[7] = 4
                //i = 4
                //arr[6] = 0
                //i = 3
                //arr[4] = 3
                //i = 2
                //arr[3] = 2
                //i = 1
                //arr[2] = 0
                //i = 0
                //arr[0] = 1
                arr[i + count] = arr[i]
                if (arr[i] == 0) {
                    //i = 4
                    //arr[5] = 0 (0 복제)
                    //count = 1
                    //i = 1
                    //arr[1] = 0
                    //count = 0
                    arr[i + count - 1] = 0                
                    count--
                }
            } else {
                //배열의 맨 마지막 데이터가 0일 경우 복제할 수 없으므로
                //count에서 1을 빼준다.
                if (arr[i] == 0) {
                    count--
                }
                // i = 7,6일 때 통과                
                if (i + count <= arr.size - 1) {
                    arr[i + count] = arr[i]
                }
            }
        }
    }
}
