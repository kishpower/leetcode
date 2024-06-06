package ConstructBinaryTreefromInorderandPostorderTraversal106;

import DataStructures.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> inOrderMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0 ; i < inorder.length ; i++){
            inOrderMap.put(inorder[i], i);
        }
        return construct(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode construct(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight) {
        if (inLeft > inRight || postLeft > postRight) return null;

        int pVal = postorder[postRight--];
        TreeNode root = new TreeNode(pVal);

        int inRootIdx = inOrderMap.get(pVal);

        root.left = construct(inorder, inLeft, inRootIdx - 1, postorder, postLeft, postLeft + inRootIdx - inLeft - 1);
        root.right = construct(inorder, inRootIdx + 1 , inRight, postorder,postLeft + inRootIdx - inLeft , postRight);

        return root;
    }



}
