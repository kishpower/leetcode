package BinaryTreeZigzagLevelOrderTraversal103;

import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(List.of(root));
        List<List<Integer>> result = new ArrayList<>();
        int level = 0;
        while (q.size() > 0){
            int rowLen = q.size();
            LinkedList<Integer> row = new LinkedList<>();
            for (int i = 0; i < rowLen; i++){
                TreeNode remove = q.poll();
                if (level % 2 == 0){
                    row.add(remove.val);
                }else {
                    row.addFirst(remove.val);
                }
                if (remove.left != null) q.offer(remove.left);
                if(remove.right != null) q.offer(remove.right);
            }
            level++;
            result.add(row);
        }

        return result;
    }
}
