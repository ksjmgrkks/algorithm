class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        //Input: rowIndex = 3
        //Output: [1,3,3,1]
        if (rowIndex == 0)
            return arrayListOf(1)
        if (rowIndex == 1)
            return arrayListOf(1, 1)
        var arr = arrayListOf(1, 2, 1)
        var count = 2
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
