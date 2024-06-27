package KthSmallestElementinaBST230;

import DataStructures.TreeNode;

public class Solution {
    int ans;
    int count;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode root) {
        if (root.left != null) inOrder(root.left);
        count--;
        if (count == 0) {ans = root.val;return;}
        if (root.right != null) inOrder(root.right);
    }

}
