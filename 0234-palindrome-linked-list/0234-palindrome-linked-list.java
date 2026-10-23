/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return true;
        
        ListNode midleNode = solve(head, null, head, head);

        ListNode head2 = midleNode.next;
        if(head2.next != null) head2 = solve2(head2, head2, null, head2.next);
        
        midleNode.next = null;
        
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while(temp1 != null){
            if(temp1.val != temp2.val) return false;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;

        
    }
    public ListNode solve(ListNode head , ListNode temp, ListNode slow, ListNode fast )
    {
       if(fast == null || fast.next == null){
          return temp;
       }  

      return solve(head, slow, slow.next, fast.next.next);

    }

    public ListNode solve2(ListNode head , ListNode curr, ListNode prev, ListNode forward )
    {
      //if(curr.next == null) return head;

      curr.next = prev;
      if(forward == null) return curr;
      prev = curr;
      curr = forward;
      forward = forward.next;

      return solve2(head, curr, prev, forward);


    }
}