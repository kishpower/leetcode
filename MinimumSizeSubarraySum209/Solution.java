package MinimumSizeSubarraySum209;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }


//    this is a two pointer approach

//    public static int minSubArrayLen(int target, int[] nums) {
//        int i = 0;
//        int j = 0;
//        int minLen = Integer.MAX_VALUE;
//        int sum = 0;
//
//        while (j < nums.length){
//           sum += nums[j];
//
//           while(sum >= target){
//                sum -= nums[i];
//                minLen = Math.min(j - i + 1 , minLen);
//                i++;
//           }
//           j++;
//        }
//
//        if (minLen == Integer.MAX_VALUE) return 0;
//
//        return minLen;
//    }


//    this is a binary search approach
    public static int minSubArrayLen(int target , int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int minLen = 0;
        while (start < end){
            int mid = (end - start)/2;

            if (windowFind(mid , nums , target)){
               minLen = mid;
               end = mid -1 ;
            }else {
                start = mid + 1;
            }
        }

        return minLen;
    }

    public static boolean windowFind(int size , int nums[] , int target){
        int sum = 0;
        int i = 0;
        int j = 0;
        int localMax = Integer.MIN_VALUE;
        int n = nums.length;

        while (j < n){
            sum += nums[j];
            if (j - i + 1 == size){
                localMax = Math.max(localMax , sum);
                sum -= nums[i];
                i++;
            }
            j++;
        }

        if (localMax >= sum) return true;
        return false;
    }
}
