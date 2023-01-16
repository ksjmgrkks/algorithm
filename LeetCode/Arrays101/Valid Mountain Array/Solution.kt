class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        val mountainTop = arr.max()
        var mountainTopIndex = 0

        for (i in arr.indices) {
            if (arr[i] == mountainTop!!)
                mountainTopIndex = i
        }

        if (mountainTopIndex == arr.size - 1 || mountainTopIndex == 0)
        //최대값의 인덱스가 배열의 끝인 경우에는 산 모양이 아니므로 false
            return false

        for (i in 0..arr.size - 2) {
            if (i < mountainTopIndex) {
                //산을 올라갈 때
                if (arr[i] >= arr[i + 1])
                    return false
            } else {
                //산 꼭대기부터 산을 내려갈 때
                if (arr[i] <= arr[i + 1])
                    return false
            }
        }
        return true
    }
}
