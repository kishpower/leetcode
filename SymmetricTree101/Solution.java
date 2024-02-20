package SymmetricTree101;
 class TreeNode {
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

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return root.left.val == root.right.val && isMirror(root.right,root.left);
    }

    private boolean isMirror(TreeNode right, TreeNode left) {
       if (right == null || left == null) return right == left;

       return right.val == left.val && isMirror(right.right,right.left) && isMirror(left.right,left.left);
    }

}
