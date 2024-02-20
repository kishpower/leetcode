package PalindromeNumber9;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    private static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int reversed = 0 ;
        int temp = x;

        while(temp!=0){
            reversed = reversed * 10 + temp % 10;
            temp = temp / 10;
        }
        return reversed == temp;
    }
//    public static boolean isPalindrome(int x) {
//        String s = "" + x;
//
//        for (int i = 0 , j = s.length() - 1; i< s.length()/2 ; i++, j--){
//            if (s.charAt(i) != s.charAt(j)) return false;
//        }
//
//        return true;
//    }

}
