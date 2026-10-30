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
    public ListNode mergeNodes(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head.next;
        int data = 0;

        while(pointer2 != null){
           
            if (pointer2.val != 0) {

                data = data + pointer2.val;

            } else {

                pointer1.val = data;

                pointer1.next = pointer2.next;

                pointer1 = pointer1.next;

                data = 0;
            }

            pointer2 = pointer2.next;
        }

        return head;

    }
}