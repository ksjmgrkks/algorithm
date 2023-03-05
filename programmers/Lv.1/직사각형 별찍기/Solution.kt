fun main(args: Array<String>) {
    //시간복잡도 O(2n)
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var star = ""    
    for(i in 1..a){
        star += '*'           
    }     
    for(i in 1..b){
       println(star)        
    }   
}
