package JumpGameII45;

public class Solution {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,1,1,3,4}));
    }
    public static int jump(int[] nums){
        int ans = 0;
        int end = 0;
        int farthest = 0;

        // Implicit BFS
        for (int i = 0; i < nums.length - 1; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                ++ans;
                break;
            }
            if (i == end) {   // Visited all the items on the current level
                ++ans;          // Increment the level
                end = farthest; // Make the queue size for the next level
            }
        }

        return ans;
    }
}
