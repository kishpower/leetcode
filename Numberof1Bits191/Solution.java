package Numberof1Bits191;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hammingWeight(5));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i<32 ; i++){
            if ((n & 1) == 1) count++;
            n = n>>1;
        }

        return count;
    }
}
