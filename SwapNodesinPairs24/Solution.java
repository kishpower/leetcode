package SwapNodesinPairs24;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        [1,2,3,4]
        ListNode ln = new ListNode(4);
        ListNode ln2 = new ListNode(3,ln ) ;
        ListNode ln3 = new ListNode(2,ln2 ) ;
        ListNode ln4 = new ListNode(1,ln3 ) ;

        ListNode trav = swapPairs(ln4);
        while(trav != null){
            System.out.print(trav.val + " ");
            trav = trav.next;
        }
    }
    static class ListNode {
      int val;
      ListNode next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }

        ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;    }
}
