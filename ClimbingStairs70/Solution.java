package ClimbingStairs70;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(climbStairs(7));
        int n = 7;
        int[] dp = new int[n + 1];

        for (int i = 0 ; i < n + 1; i++){
            dp[i] = -1;
        }
        System.out.println("dp = " + Arrays.toString(dp));
        System.out.println(climbStairs(n , dp ));
        System.out.println("dp = " + Arrays.toString(dp));
    }

//    public static int climbStairs(int n) {
//        if (n == 0 || n == 1) return 1;
//        else {
//            int[] steps = new int[n + 1];
//            steps[0] = 1;
//            steps[1] = 1;
//            for (int i = 2 ; i < n + 1; i++){
//                steps[i] = steps[i-2] + steps[i-1];
//            }
//            return steps[n];
//        }
//    }
    public static int climbStairs(int n , int[] dp){
        if (n <= 1) return 1;
        if (dp[n] != -1) return dp[n];
        dp[n] = climbStairs(n-1, dp) + climbStairs(n-2, dp);
        return dp[n];
    }
}
