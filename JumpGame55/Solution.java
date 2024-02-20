package JumpGame55;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,5,0,0}));
    }
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
