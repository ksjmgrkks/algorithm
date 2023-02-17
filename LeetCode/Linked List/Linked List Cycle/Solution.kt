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
    //시간복잡도 O(n), 공간복잡도 O(n)
    fun hasCycle(head: ListNode?): Boolean {
        var headNode = head
        val nodesSeen: MutableSet<ListNode> = HashSet()
        while (headNode != null) {
            if(nodesSeen.contains(headNode))
                return true
            nodesSeen.add(headNode)
            headNode = headNode.next
        }
        return false
    }
  
    //시간복잡도 O(n), 공간복잡도 O(1)
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null || head.next == null)
            return false

        var slow: ListNode = head
        var fast: ListNode = head.next

        while (slow != fast) {
            if (fast == null || fast.next == null || fast.next.next == null)
                return false                
            slow = slow.next
            fast = fast.next.next
        }

        return true
    }
}
