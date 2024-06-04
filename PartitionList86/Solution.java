package PartitionList86;

import DataStructures.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyPrev = new ListNode(-1);
        ListNode dummyFwd = new ListNode(-1);

        ListNode prev = dummyPrev , fwd = dummyFwd , curr = head;

        while (curr != null){
            if(curr.val < x){
                prev.next = curr;
                prev = curr;
            }else {
                fwd.next = curr;
                fwd = curr;
            }

            curr = curr.next;
        }
        fwd.next = null;
        prev.next = dummyFwd.next;

        return dummyPrev.next;
    }
}
