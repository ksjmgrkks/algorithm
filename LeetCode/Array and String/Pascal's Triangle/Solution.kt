class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val answer: ArrayList<List<Int>> = arrayListOf()
        var preArr: ArrayList<Int> = arrayListOf()
        var tempArr: ArrayList<Int>
         for(i in 1..numRows){
             when(i){
                 1 -> answer.add(arrayListOf(1))
                 2 -> {
                     preArr = arrayListOf(1,1)
                     answer.add(preArr)
                 }
                 else ->{
                     tempArr = arrayListOf()
                     for(j in 0 until i){
                         if(j == 0 || j == i-1){
                             tempArr.add(1)
                         }else{
                             tempArr.add(preArr[j-1] + preArr[j])
                         }
                     }
                     preArr = tempArr
                     answer.add(tempArr)
                 }
             }
         }
         return answer
    }
}
