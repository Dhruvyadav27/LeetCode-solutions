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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode forward = head;
        int size = 0;

        while(curr != null){
            curr = curr.next;
            size++;
        }

        int i = k%size;
        if(i == 0 || size == k) return head;
        curr = head;
       
        while(i > 0){
            if(forward.next == null) return null;
            forward = forward.next;
            i--;
        }

        while(forward.next != null){

            forward = forward.next;
            curr = curr.next;

        }

        ListNode headpointer = curr.next;
        curr.next = null;
        forward.next = head;
        head = headpointer;

        return head;
    }
}