class Solution {
    //참고1 : https://thdev.tech/kotlin/2016/10/02/Kotlin-Basic-Types/
    //참고2 : https://thdev.tech/kotlin/2020/10/20/kotlin_effective_07/
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOfNulls<IntArray>(arr1.size)
        for(i in arr1.indices){
            val intArray = IntArray(arr1[0].size)
            for(j in arr1[0].indices){
                intArray[j] = arr1[i][j] + arr2[i][j]
            }
            answer[i] = intArray
        }
        return answer as Array<IntArray>
    }
    
    fun solution2(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) {
            row ->
            IntArray(arr1[0].size) {
                col ->
                arr1[row][col] + arr2[row][col]
            }
        }
    }
}
