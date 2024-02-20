package RemoveElement27;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        removeElement(new int[]{3, 2, 2, 3,34,456,2},3);
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0;j<nums.length;j++){
            if (nums[j]!=val){
                int temp = nums[j];
                nums[j]= nums[i];
                nums[i]= temp;
                i++;
            }
        }
        System.out.println("i = " + i + Arrays.toString(nums));
        return i;
    }
//public static int removeElement(int[] nums, int val) {
//    int i = 0;
//    for (int j = 0; j < nums.length; j++) {
//        if (nums[j] != val) {
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i++;
//        }
//    }
//    System.out.println("nums = " + Arrays.toString(nums));
//    return i;
//}
}
