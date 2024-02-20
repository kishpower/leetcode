package ValidPalindrome125;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
    public static boolean isPalindrome(String s) {
        String stringWithAlphaNumericChars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i=0;i<stringWithAlphaNumericChars.length()/2;i++){
            if (stringWithAlphaNumericChars.charAt(i)!=stringWithAlphaNumericChars.charAt(stringWithAlphaNumericChars.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
