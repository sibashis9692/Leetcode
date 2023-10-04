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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode first = head;

        if(head == null || head.next == null){
            return false;
        }

        do{
            slow = slow.next;
            first = first.next;

            if(first != null){
                first = first.next;
            }

            if(slow == null || first == null){
                return false;
            }
        }while(slow != first);

        return true;
    }
}