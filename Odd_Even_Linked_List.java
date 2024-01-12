// https://leetcode.com/problems/odd-even-linked-list/description/


class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode p = head;
        ListNode p_pointer = p;

        ListNode q = head.next;
        ListNode q_pointer = q;

        ListNode ptr = q.next;

        int current = 1;

        while(ptr != null){
            if(current % 2 != 0){
                p_pointer.next = ptr;
                
                p_pointer = p_pointer.next;
                ptr = ptr.next;

                current += 1;
            }
            else{
                q_pointer.next = ptr;

                q_pointer = q_pointer.next;
                ptr = ptr.next;

                current += 1;
            }
        }

        q_pointer.next = null;

        p_pointer.next = q;

        return p;
    }
}
