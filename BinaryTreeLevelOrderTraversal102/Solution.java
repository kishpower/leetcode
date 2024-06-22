package BinaryTreeLevelOrderTraversal102;

import DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        q.offer(root);
        while (q.size() > 0){
            ArrayList<Integer> row = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++){
                TreeNode remove = q.poll();
                row.add(remove.val);

                if (remove.left != null) q.offer(remove.left);
                if (remove.right != null) q.offer(remove.right);
            }
            result.add(row);
        }

        return result;
    }
}
