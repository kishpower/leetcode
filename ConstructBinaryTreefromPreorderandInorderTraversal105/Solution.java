package ConstructBinaryTreefromPreorderandInorderTraversal105;

import DataStructures.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> inorderMap = new HashMap<>();
    private int preOrderIdx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        for (int i = 0 ; i < len; i++){
            inorderMap.put(inorder[i], i);
        }

        return construct(preorder, 0, len - 1);
    }

    private TreeNode construct(int[] preorder, int left, int right) {
        if (left > right) return null;

        int rootInOrderIdx = inorderMap.get(preorder[preOrderIdx]);
        TreeNode root = new TreeNode(preorder[preOrderIdx++]);

        root.left = construct(preorder, left, rootInOrderIdx - 1);
        root.right = construct(preorder, rootInOrderIdx + 1, right);
        return root;

    }

}
