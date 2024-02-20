package TwoSum1;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{4,3,1,2}, 6)));
    }
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i< nums.length;i++){
//            for (int j=i+1;j< nums.length;j++){
//                if (nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//
//        return null;
//    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int curr = nums[i];
            int num = target - curr;

            if (map.containsKey(num)){
                return new int[]{i,map.get(num)};
            }else {
                map.put(curr,i);
            }

        }
        return null;

    }


}
