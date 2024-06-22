package BinaryTreeRightSideView199;

import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        right(root, result, 0);
        return result;
    }

    private void right(TreeNode root, List<Integer> result, int currDepth) {
        if (root == null) return ;

        if (currDepth == result.size()){
            result.add(root.val);
        }

        right(root.right, result , currDepth + 1);
        right(root.left,  result, currDepth - 1);
    }
}
