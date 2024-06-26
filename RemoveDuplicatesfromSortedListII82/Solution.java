package RemoveDuplicatesfromSortedListII82;

import DataStructures.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = prev.next;
        while(curr != null){
           while (curr.next != null && curr.val == curr.next.val) {
               curr = curr.next;
           }
           if (prev.next == curr) prev = prev.next;
           else prev.next = curr.next;

           curr = curr.next;
        }

        return dummy.next;
    }
}
