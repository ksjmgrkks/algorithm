class Solution {
    fun replaceElements1(arr: IntArray): IntArray {
        //시간 복잡도 O(n)
        var max = arr.last()
        arr[arr.lastIndex] = -1
        for (i in arr.lastIndex - 1 downTo 0) {
            //arr[i]값을 저장할 임시변수 temp
            val temp = arr[i]
            arr[i] = max
            max = Math.max(max, temp)
        }
        return arr
    }

    fun replaceElements2(arr: IntArray): IntArray {
        //시간 복잡도 O(n^2)
        for (i in 1 until arr.size) {
            var max = 0
            for (j in i until arr.size) {
                max = Math.max(arr[j], max)
                arr[i - 1] = max
            }
        }
        arr[arr.size - 1] = -1
        return arr
    }
}
