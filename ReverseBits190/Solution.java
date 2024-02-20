package ReverseBits190;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseBits(1));
    }


    public  static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i<32; i++){
            result = (n & 1) | (result << 1);
            n = n >>> 1;
        }

        return result;
    }
}
