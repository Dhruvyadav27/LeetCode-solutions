/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode isCycleAvailable = isCycle(head, head);

        if(isCycleAvailable != null){
             ListNode slow = head;
             ListNode fast = isCycleAvailable;
       
             while(slow != fast){
            
             slow = slow.next;
             fast = fast.next;
            

             }
             return fast;
        }
        else return null;

    }
    public ListNode isCycle(ListNode slow, ListNode fast){
         while(slow.next != null){
            
            slow = slow.next;
            fast = fast.next;
            if(fast == null) return null;
            fast = fast.next;
            if(fast == null) return null;
            else if(fast == slow) return fast;

        }
        return null;
    }
}