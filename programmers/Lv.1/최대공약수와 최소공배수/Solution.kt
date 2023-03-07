class Solution {
    //참고: https://imkh.dev/algorithm-gcd-lcm/    
    fun solution(n: Int, m: Int): IntArray {
        var answer = IntArray(2)
        var gcd = 0
        if(n >= m){
            gcd = gcd(n, m)            
        }else{
            gcd = gcd(m, n)
        }
        val lcm = lcm(m, n, gcd)
        
        answer[0] = gcd
        answer[1] = lcm
        
        return answer
    }
    
    //최대 공약수
    fun gcd(a : Int, b : Int) : Int{
        var large = a
        var small = b
        var r = 0
        while(small != 0){ 
            r = large % small
            large = small
            small = r            
        } 
        return large   
    }
    
    //최소 공배수
    fun lcm(a : Int, b : Int, gcd : Int) : Int = (a * b) / gcd
  
  
  /* 다른 풀이 */
  
  class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)
        return intArrayOf(gcd, n * m / gcd)
    }
    tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }
}
