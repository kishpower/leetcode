package InvertBinaryTree226;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>() {
        };
        queue.add(root);

        while(queue.size() != 0){
            TreeNode temp = queue.poll();
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);

            TreeNode curr = temp.left;
            temp.left =  temp.right;
            temp.right = curr;
        }

        return root;
    }
}
