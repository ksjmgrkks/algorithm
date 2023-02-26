class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray =
     arr.filter{ it % divisor == 0 }.sorted().toMutableList().run {
        if(size == 0) add(-1)
        toIntArray()
     }
}
