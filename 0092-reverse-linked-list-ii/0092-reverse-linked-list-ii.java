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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode l = dummy;
        ListNode r = dummy;

        for(int i = 1; i <= right; i++){
            if(i < left){
                l = l.next;
            }
            r = r.next;
        }
        
        ListNode l_next = l.next;
        ListNode r_next = r.next;

        r.next = null;

        reverseListNode(l_next);

        l.next = r;
        l_next.next = r_next;
        return dummy.next;
    }

    public static void reverseListNode(ListNode head){
        if(head.next == null){
            return;
        }

        reverseListNode(head.next);

        head.next.next = head;
        head.next = null;
    }
}