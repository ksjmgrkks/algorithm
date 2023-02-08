class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0)
            return arrayListOf(1)
        var arr = arrayListOf(1, 1)
        var count = 1
        while (count < rowIndex) {
            val temp = arrayListOf<Int>()
            for (index in arr.indices) {
                if (index == 0) {
                    temp.add(1)
                } else {
                    temp.add(arr[index] + arr[index - 1])
                }
            }
            temp.add(1)
            arr = temp
            count++
        }
        return arr
    }
}
