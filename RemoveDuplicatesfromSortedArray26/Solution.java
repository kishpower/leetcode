package RemoveDuplicatesfromSortedArray26;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        removeDuplicates(new int[]{0,1,2,2,2,3,4});
    }
    public static int removeDuplicates(int[] nums) {
        int count=1;

        for (int i = 1;i< nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        System.out.println("nums = " + Arrays.toString(nums) + count);
        return count;
    }
}
