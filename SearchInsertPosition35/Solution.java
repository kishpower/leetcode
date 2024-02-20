package SearchInsertPosition35;

public class Solution {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},5));

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0 ; i<nums.length ; i++){
            if (nums[i] == target) return i;
            else if(target < nums[i]) {
                if (i == 0) return i;
                return i;
            }
        }

        return nums.length;
    }
}
