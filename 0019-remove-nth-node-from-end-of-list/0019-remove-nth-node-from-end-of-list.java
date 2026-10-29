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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) return null;
        ListNode curr = head;
        ListNode forward = head;
        int i = 1;
        while(i < n){
            forward = forward.next;
            i++;
        }
        ListNode prev = null;
        while(forward.next != null){
            prev = curr;
            curr = curr.next;
            forward = forward.next;
        }
        if(prev == null){
            head = curr.next;
            curr.next = null;
        }
        else prev.next = curr.next;
        return head;
    }
}