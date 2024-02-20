package RotateArray189;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    public static void rotate(int[] nums, int k){
        k = k % nums.length;

        reverse(nums, 0 , nums.length - k - 1);
        reverse(nums, nums.length - k , nums.length - 1);
        reverse(nums, 0 , nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
//        int mid = start + (end - start)/2;
//        for (int i = start , j = 0; i <= mid ; i++ , j++){
//            int temp = nums[i];
//            nums[i] = nums[end - j];
//            nums[end - j] = temp;
//        }
        while(start < end){
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;

           end--;
           start++;
        }

    }
//    public static void rotate(int[] nums, int k) {
//        int[] result = new int[nums.length];
//        for (int i =  k % nums.length, j = 0 ; j < nums.length; j++){
//            result[i] = nums[j];
//            i++;
//            if (i >= nums.length) i = i % nums.length;
//        }
//
//        for (int i = 0 ; i < nums.length ; i++){
//            nums[i] = result[i];
//        }
//    }
}
