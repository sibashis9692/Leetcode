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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode ptr = head;

        while(ptr != null){
            if(ptr.next != null){
                int num1 = ptr.val;
                int num2 = ptr.next.val;
                int data = greatestCommonDivisors(num1, num2);
                ListNode newNode = new ListNode(data);
                newNode.next = ptr.next;
                ptr.next = newNode;
                ptr = ptr.next.next;
            }
            else{
                ptr = ptr.next;
            }
        }
        return head;
    }

    public static int greatestCommonDivisors(int num1, int num2){
        int min = num1 > num2 ? num2 : num1;
        int GCD = 1;

        for(int i = 2; i <= min; i++){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println(i);
                GCD = GCD < i ? i : GCD;
            }

        }

        return GCD;
    }
}