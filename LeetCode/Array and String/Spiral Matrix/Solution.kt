class Solution {
    data class Coordinate(var x:Int, var y: Int)
    
    private fun containsCoordinate(arr: ArrayList<Coordinate>, x:Int, y: Int): Boolean{
        for(i in arr){
            if(i.x == x && i.y == y)
                return true
        }
        return false
    }
    
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var x = 0
        var y = 0
        var moveCount = 0
        var direction = 4 //1: 상, 2:하, 3:좌, 4:우
        val arr = arrayListOf<Coordinate>()
        val answer = arrayListOf<Int>()
        if(matrix.size * matrix[0].size == 1){
            answer.add(1)
            return answer
        }
        while (moveCount < matrix.size * matrix[0].size) {
            answer.add(matrix[x][y])
            arr.add(Coordinate(x,y))
            if (direction == 4) {
                //우
                if (y < matrix[0].size - 1 && !containsCoordinate(arr, x,y+1)) {
                    //x, y+1
                    y++
                } else {
                    x++
                    direction = 2
                }
            } else if (direction == 2) {
                //하
                if (x < matrix.size - 1 && !containsCoordinate(arr, x+1,y)) {
                    //x+1, y
                    x++
                } else {
                    y--
                    direction = 3
                }
            } else if (direction == 3) {
                //좌
                if (y > 0 && !containsCoordinate(arr, x,y-1)) {
                    //x, y-1
                    y--
                } else {
                    x--
                    direction = 1
                }
            } else {
                //상
                if (x > 0 && !containsCoordinate(arr, x-1,y)) {
                    //x-1, y
                    x--
                } else {
                    y++
                    direction = 4
                }
            }
            moveCount++
        }
        return answer
    }
}
