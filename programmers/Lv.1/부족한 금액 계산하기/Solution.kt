class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var currentMoney = money.toLong()
        
        for(i in 1..count) {
            val currentPrice = price * i
            currentMoney -= currentPrice          
        }
        
        if(currentMoney >= 0) {
            return 0
        }        
        return currentMoney * -1
    }
}
