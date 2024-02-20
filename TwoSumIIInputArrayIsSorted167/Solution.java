package TwoSumIIInputArrayIsSorted167;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }



    //lvl 1 scrub ans -> not doing any observation if the array is sorted,very crude approach
//    public static int[] twoSum(int[] numbers, int target) {
//        int[] ans = new int[2];
//        for (int i = 0 ; i < numbers.length -1 ; i++){
//            for (int j = i + 1 ; j < numbers.length ; j++){
//                if (numbers[i] + numbers[j] == target){
//                    ans[0] = i + 1;
//                    ans[1] = j + 1;
//                    return ans;
//                }
//                while(j < numbers.length - 1 && numbers[j] == numbers[j + 1]) j++;
//            }
//            while(i < numbers.length - 2 && numbers[i] == numbers[i + 1]) i++;
//        }
//
//        return ans;
//    }

    //lvl 100 chad -> does observation , come up with different ways to solve the question.
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0 ;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target){
            if (numbers[left] + numbers[right] < target) left++;
            else right--;
        }

        return new int[]{left + 1, right + 1};
    }

}
