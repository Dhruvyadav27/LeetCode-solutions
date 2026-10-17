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
    public ListNode middleNode(ListNode head) {
       ListNode prev = head;
       ListNode curr = prev.next;
       
       return solve(head, prev, curr); 
    }
    public ListNode solve(ListNode head, ListNode prev, ListNode curr){
       
       if(curr == null){
        return prev;
       }
       prev = prev.next;
       curr = curr.next;
       if(curr == null){
        return prev;
       }
       curr = curr.next;
       if(curr == null){
        return prev;
       }
       return solve(head, prev, curr);
    
    }
}