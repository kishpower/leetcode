package CountCompleteTreeNodes222;

import DataStructures.TreeNode;

public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = calculateLeftHeight(root);
        int rightHeight = calculateRightHeight(root);

        if(leftHeight == rightHeight) return (int) (Math.pow(2,leftHeight) - 1);
        return 1 + countNodes(root.left) + countNodes(root.right);
   }



    private int calculateRightHeight(TreeNode root) {
        int count = 0;
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }

    private int calculateLeftHeight(TreeNode root) {
        int count = 0;
        while (root != null){
           count++;
           root = root.left;
        }
        return count;
    }
}
