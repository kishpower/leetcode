package MaximumSubarray53;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{100,-1,-2,-3,-5};
        System.out.println(        maxSubArray(array)
);
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
}
