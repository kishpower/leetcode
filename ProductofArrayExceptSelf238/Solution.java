package ProductofArrayExceptSelf238;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }

//    private static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        Arrays.fill(ans,1);
//
//        int curr = 1;
//        for (int i =0 ; i < n ; i++){
//            ans[i] = ans[i] * curr;
//            curr = curr * nums[i];
//        }
//
//        curr = 1;
//        for (int i = n - 1 ; i>= 0 ; i--){
//            ans[i] = ans[i] * curr;
//            curr = curr * nums[i];
//        }
//
//        return ans;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0 ; i < result.length ; i++){
            int product = 1;
            for (int j = 0; j < result.length ; j++){
                if ( j == i ) continue;
                if ( nums[j] == 0){
                    result[i] = 0;
                    break;
                }
                product *= nums[j];
            }
            result[i] = product;
        }

        return result;
    }

//    public static int[] productExceptSelf(int[] nums){
//        int n = nums.length;
//        int[] suffix = new int[n];
//        int[] prefix = new int[n];
//        suffix[n - 1] = 1;
//        prefix[0] = 1;
//
//        for (int i = 1; i < n ; i++){
//            prefix[i] = prefix[i - 1] * nums[i - 1];
//        }
//
//        for (int i = n - 2; i >= 0 ; i--){
//            suffix[i] = suffix[i + 1] * nums[i + 1];
//        }
//
//        int[] ans = new int[n];
//        for (int i = 0 ; i < n ; i++){
//            ans[i] = prefix[i] * suffix[i];
//        }
//
//        return ans;
//
//    }

    //programmer notes : we can also use a single ans array instead of creating prefixs and suffixes.
    //try to think how this can be achieved.
//    here is the solution
//    private static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        Arrays.fill(ans,1);
//
//        int curr = 1;
//        for (int i =0 ; i < n ; i++){
//            ans[i] = ans[i] * curr;
//            curr = curr * nums[i];
//        }
//
//        curr = 1;
//        for (int i = n - 1 ; i>= 0 ; i--){
//            ans[i] = ans[i] * curr;
//            curr = curr * nums[i];
//        }
//
//        return ans;
//    }

}

