package IsSubsequence392;
public class Solution {
    public static void main(String[] args) {
        isSubsequence("acb","ahbgdc");
    }
    public static boolean isSubsequence(String s, String t) {
        int givenStringLength = t.length();
        int i = 0, j = 0;
        for (int k=0;k<givenStringLength;k++){
            if (s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;

            if (i == s.length()) return true;
        }


        return false;
    }
}
