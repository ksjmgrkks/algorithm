class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        for(i in 0 until arr.size){
            for(j in 0 until arr.size){
                if(i != j && arr[i] == 2*arr[j])
                    return true                
            }     
        }
        return false        
    }
}
