package ContainsDuplicateII219;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        boolean b = containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        System.out.println(b);
    }

//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i=0;i<nums.length;i++){
//            for (int j=i+1;j< nums.length;j++){
//                if (nums[i]==nums[j] && Math.abs(i-j) <= k) return true;
//            }
//        }
//
//        return false;
//    }

    public static boolean containsNearbyDuplicate(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(i - map.get(nums[i])) <= k ){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
