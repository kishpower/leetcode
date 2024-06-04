package CopyListwithRandomPointer138;

import java.util.HashMap;

public class Solution {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//        Node curr = head;
//        HashMap<Node, Node> oldToNewNodeMap = new HashMap<>();
//
//        while(curr != null){
//            oldToNewNodeMap.put(curr, new Node(curr.val));
//            curr = curr.next;
//        }
//
//        curr = head;
//        while(curr != null){
//            oldToNewNodeMap.get(curr).next = oldToNewNodeMap.get(curr.next);
//            oldToNewNodeMap.get(curr).random = oldToNewNodeMap.get(curr.random);
//            curr = curr.next;
//        }
//
//        curr = head;
//
//        return oldToNewNodeMap.get(curr);
//    }
      public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;

        while(curr != null){
           Node temp = new Node(curr.val, curr.next) ;
           curr.next = temp;
           curr = temp.next;
        }

        curr = head;

        while(curr != null){
            if (curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next != null ? curr.next.next : null;
        }

        Node old_head = head;
        Node new_head = head.next;
        Node curr_old = old_head;
        Node curr_new = new_head;

        while(curr_old != null){
           curr_old.next = curr_old.next.next;
           curr_new.next = curr_new.next != null ? curr_new.next.next : null;
           curr_old = curr_old.next;
           curr_new = curr_new.next;
        }

        return new_head;
      }
}
