package PlusOne66;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >=0 ; i--){
            if (digits[i] < 9){
                digits[i] += 1;
                return digits;
            }

           digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
