package PopulatingNextRightPointersinEachNodeII117;

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
public class Solution {
    public Node connect(Node root) {
        Node dummy = new Node(0);
        Node curr = dummy, real_root = root;

        while(root != null){
            if (root.left != null){
                curr.next = root.left;
                curr = curr.next;
            }
            if (root.right!= null){
                curr.next = root.right;
                curr = curr.next;
            }
            root = root.next;
            if (root == null){
                curr = dummy;
                root = dummy.next;
                dummy.next = null;
            }
        }

        return real_root;
    }
}
