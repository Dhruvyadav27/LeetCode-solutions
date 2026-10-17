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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
       
       return solve(head, prev, curr);
    }
    public ListNode solve(ListNode head, ListNode prev, ListNode curr){
       

       if (curr == null){
           head = prev;
           return prev;
       }
       ListNode forward = curr.next;

       curr.next = prev;
       prev = curr;
       curr = forward;
       return solve(head, prev, curr);
       
       

    }
}