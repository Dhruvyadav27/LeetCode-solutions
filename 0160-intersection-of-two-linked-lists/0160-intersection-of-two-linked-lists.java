/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while(a !=null && b != null){
            b = b.next;
            a = a.next;
        }

        ListNode d = headA;
        ListNode c = headB;

        if(a == null && b != null){
            
            while(b != null){
                b = b.next;
                c = c.next;
            }
        } 

        else{
            
            while(a != null){
                a = a.next;
                d = d.next;
            }
        } 

        while(c != null) {
            if(c == d){
                return c;
            }

            c = c.next;
            d = d.next;
        } 

        return null;  
    }
}