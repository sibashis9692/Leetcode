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

    static ListNode ptr = null;
    public boolean isPalindrome(ListNode head) {
        ptr = head;

        return helper(head);
    }

    public static boolean helper(ListNode head){
        if(head == null){
            return true;
        }
        boolean check = helper(head.next);

        if(check && ptr.val == head.val){
            ptr = ptr.next;
            return true;
        }
        else{
            return false;
        }
    }
}