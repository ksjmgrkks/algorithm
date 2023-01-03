/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        //f-> fast
		//s -> slow
    
		//Example 1
		//head-> 1  -> 2  -> 3  -> 4  -> 5  = fast , slow
		//While
		//                      f
		//1. Stage -> 1 -> 2 -> 3 -> 4 -> 5
		//                 s
    
		//                                  f           
		//2. Stage   -> 1 -> 2 -> 3 -> 4 -> 5
		//                        s
		//result : 3 -> 4 -> 5
        //        (s)
    
    
		//Example 2
		//head-> 1  -> 2  -> 3  -> 4  -> 5 -> 6  = fast , slow
		//While
		//                      f
		//1. Stage -> 1  -> 2  -> 3  -> 4  -> 5 -> 6 
		//                 s
    
		//                                      f           
		//2. Stage   -> 1  -> 2  -> 3  -> 4  -> 5 -> 6 
		//                          s
    
		//                                                f 
		//3. Stage   -> 1  -> 2  -> 3  -> 4  -> 5 -> 6 -> NULL 
		//                                s
		//result : 4 -> 5 -> 6
        //        (s)
        var fast = head
        var slow = head

        while(fast != null && fast.next != null){
            slow = slow!!.next
            fast = fast!!.next.next
        }

        return slow
    }
}
