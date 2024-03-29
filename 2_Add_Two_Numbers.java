// https://leetcode.com/problems/add-two-numbers/description/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode k = dummy;

        int pow = 0;

        while(ptr1 != null && ptr2 != null){
            int sum = (ptr1.val + ptr2.val) + pow;

            ListNode node = new ListNode(sum % 10);
            k.next = node;
            k = k.next;

            pow = (int)sum / 10;

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        while(ptr1 != null){
            int sum = (ptr1.val) + pow;

            ListNode node = new ListNode(sum % 10);
            k.next = node;
            k = k.next;

            pow = (int)sum / 10;

            ptr1 = ptr1.next;
        }

        while(ptr2 != null){
            int sum = (ptr2.val) + pow;

            ListNode node = new ListNode(sum % 10);
            k.next = node;
            k = k.next;

            pow = (int)sum / 10;

            ptr2 = ptr2.next;
        }

        if(pow != 0){
            ListNode node = new ListNode(pow);
            k.next = node;
            k = k.next;
        }


        return dummy.next;
    }
}
