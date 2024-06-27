package MinimumAbsoluteDifferenceinBST530;

import DataStructures.TreeNode;

public class Solution {
    int ans = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode root) {
        if (root.left != null) inOrder(root.left);

        ans = Math.min(ans, Math.abs(prev - root.val));
        prev = root.val;

        if (root.right != null) inOrder(root.right);
    }
}
