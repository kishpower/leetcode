package DataStructures;

public class ListNode {
      public int val;
      public ListNode next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }

        public ListNode() {}
      public ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

