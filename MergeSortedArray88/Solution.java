package MergeSortedArray88;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2,5,6};

     merge(new int[]{1, 2, 3, 0, 0, 0},3,new int[]{2,5,6},3);
//        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("nums2 = " + Arrays.toString(nums2));
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while (j>=0){
            if (i>=0 && nums1[i]>nums2[j]){
                nums1[k]= nums1[i];
                k--;
                i--;
            }else {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        System.out.println("nums1 = " + Arrays.toString(nums1));
    }

}
