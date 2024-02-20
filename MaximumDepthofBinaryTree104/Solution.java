package MaximumDepthofBinaryTree104;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));
    }
    public static class TreeNode {
      int val;
      public TreeNode left;
      public TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
//    public static int maxDepth(TreeNode root) {
//         if (root == null) return 0;
//         int rightDepth = maxDepth(root.right);
//         int leftDepth = maxDepth(root.left);
//
//         return Math.max(rightDepth,leftDepth) + 1;
//
//    }
    public static int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while (!queue.isEmpty()){
           maxDepth++;
           int size = queue.size();
           for (int i = 0 ; i < size ; i++){
               TreeNode temp = queue.remove();
               if(temp.left != null) queue.add(temp.left);
               if(temp.right != null) queue.add(temp.right);
           }
        }
        return maxDepth;
    }
}

