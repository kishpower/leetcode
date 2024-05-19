package LongestConsecutiveSequence128;

import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 0;
        int maxCount = 0;

        for (int i = 1; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                if (nums[i] == nums[i-1] + 1){
                    count++;
                }else{
                    if (count + 1 > maxCount) maxCount = count + 1;
                    count = 0;
                }
            }
        }

        if (count + 1 > maxCount) maxCount = count + 1;
        return maxCount;
    }
}
