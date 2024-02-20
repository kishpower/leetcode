package ThreeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4})
        );
    }
    public  static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length ; i++){
            if(i > 0 && nums[i]==nums[i-1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
           while(j < k){
               int sum = nums[i] + nums[j] + nums[k];
               if(sum == 0) {
                   result.add(List.of(nums[i],nums[j],nums[k]));

                   while (j<k && nums[j]==nums[j+1]) j++;
                   while (k > j && nums[k]==nums[k-1]) k--;
                   j++;
                   k--;
               }else if(sum < 0){
                   j++;
               }else if(sum > 0){
                   k--;
               }
           }
        }

        return result;
    }
}
