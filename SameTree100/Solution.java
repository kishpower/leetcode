package SameTree100;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(2);

        System.out.println(isSameTree(p,q));
    }
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> P = new LinkedList<>();
        LinkedList<TreeNode> Q = new LinkedList<>();
        LinkedList<Object> plist = new LinkedList<>();
        LinkedList<Object> qlist = new LinkedList<>();
        
        P.add(p);
        while(!P.isEmpty()){
            int size = P.size();
            for (int i = 0 ; i < size ; i++){
                TreeNode temp = P.remove();
                plist.add(temp.val);
                if(temp.left != null) {
                    P.add(temp.left);
                    plist.add(temp.left.val);
                }else {
                    plist.add(null);
                }
                if(temp.right != null) {
                    P.add(temp.right);
                    plist.add(temp.right.val);
                }else {
                    plist.add(null);
                }
            }
        }

        Q.add(q);
        while(!Q.isEmpty()){
            int size = Q.size();
            for (int i = 0 ; i < size ; i++){
                TreeNode temp = Q.remove();
                qlist.add(temp.val);
                if(temp.left != null) {
                    Q.add(temp.left);
                    qlist.add(temp.left.val);
                }else {
                    qlist.add(null);
                }
                if(temp.right != null) {
                    Q.add(temp.right);
                    qlist.add(temp.right.val);
                }else{
                    qlist.add(null);
                }
            }
        }

        return qlist.equals(plist);

    }
}
