class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val n = mat.size
        val m = mat[0].size
        val arr = IntArray(m * n) 
        var i = 0
        var j = 0
        for (k in 0 until arr.size) {
            arr[k] = mat[i][j]
            if ((i + j) % 2 == 0) {
                if (j == m - 1) {
                    i++
                } else if (i == 0) {
                    j++
                } else {
                    i--
                    j++
                }
            } else {
                if (i == n - 1) {
                    j++
                } else if (j == 0) {
                    i++
                } else {
                    i++
                    j--
                }
            }
        }
        return arr
    }
}
