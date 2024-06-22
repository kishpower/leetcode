package AverageofLevelsinBinaryTree637;

import DataStructures.TreeNode;

import java.util.*;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(List.of(root));
        ArrayList<Double> result = new ArrayList<>();

        while (q.size() > 0){
            long rowSum = 0;
            int rowLen = q.size();
            for (int i = 0; i < rowLen; i++){
                TreeNode remove = q.poll();
                rowSum += remove.val;
                if (remove.left != null) q.offer(remove.left);
                if (remove.right != null) q.offer(remove.right);
            }
            result.add(rowSum/(double) rowLen);
        }
        return result;
    }

}
