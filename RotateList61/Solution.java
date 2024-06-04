package RotateList61;

import DataStructures.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode lastNode = dummy.next;
        int size = 0;
        while (lastNode.next != null){
            size++;
            lastNode = lastNode.next;
        }
        size++;

        ListNode curr = dummy.next;
        ListNode prev = dummy;

        if (k % size > 0){
            for (int i = 0; i < size - (k % size) - 1 ; i++){
               prev = prev.next;
               curr = curr.next;
            }
            curr.next = null;
            lastNode.next = dummy.next;
            dummy.next = prev;
        }

        return dummy.next;
    }
}
