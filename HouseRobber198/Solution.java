package HouseRobber198;

import java.util.Arrays;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];

        for (int i = 1; i < nums.length; i++) {
            int notPick = dp[i - 1];
            int pick;

            if (i != 1){
                pick = nums[i] + dp[i - 2];
            }else {
                pick = nums[1];
            }

            dp[i] = Math.max(pick, notPick);
        }

        return dp[nums.length - 1];
    }

}


