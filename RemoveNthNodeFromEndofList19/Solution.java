package RemoveNthNodeFromEndofList19;

import DataStructures.ListNode;

import java.util.List;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = dummy.next;

        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        curr = prev.next;
        for (int i = 0 ; i < len - n ; i++){
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = curr.next;
        curr.next = null;

        return dummy.next;
    }
}
