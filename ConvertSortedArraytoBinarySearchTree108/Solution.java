package ConvertSortedArraytoBinarySearchTree108;

import DataStructures.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = (low + high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = construct(nums, low, mid - 1);
        root.right = construct(nums, mid + 1, high);
        return root;
    }
}
