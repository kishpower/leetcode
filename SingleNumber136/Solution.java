package SingleNumber136;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(        singleNumber(new int[]{2,1,2,1,3})
        );
    }
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i=0; i<nums.length-1;i=i+2){
            if (nums[i] != nums[i+1]) return nums[i];
        }

        return nums[nums.length-1];
    }
}
