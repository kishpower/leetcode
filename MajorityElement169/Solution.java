package MajorityElement169;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        majorityElement(new int[]{2,4,1,1,4,4,4,4,4,2,2,2});
    }
//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        System.out.println("nums = " + nums[nums.length/2]);
//        return nums[nums.length/2];
//    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num=nums[0];
        int max_count= 0;
        for (int i = 0;i<nums.length-1;i++){
            int count= 0;
            while(i+1< nums.length && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            if (count>max_count){
                max_count=count;
                num=nums[i];
            }
        }
        System.out.println("num = " + num);
        return num;
    }
}
