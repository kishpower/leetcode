package LongestSubstringWithoutRepeatingCharacters3;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    // solution using set : unoptimised solution
//    public static int lengthOfLongestSubstring(String s) {
//        HashSet<Character> set = new HashSet<>();
//        int left = 0;
//        int maxLength = 0;
//        int length = s.length();
//        for(int right = 0; right < length ; right++){
//            if (!set.contains(s.charAt(right))){
//                set.add(s.charAt(right));
//                maxLength = Math.max(right - left + 1 , maxLength);
//            }else {
//                while (set.contains(s.charAt(right))){
//                    set.remove(s.charAt(left));
//                    left++;
//                }
//                set.add(s.charAt(right));
//            }
//        }
//        return maxLength;
//    }
    public static int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128];
        Arrays.fill(charIndex , -1);
        int left = 0;
        int maxLength = 0;
        for (int right = 0 ; right < s.length() ; right++){
            if (charIndex[s.charAt(right)] >= left){
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength , right - left + 1);
        }
        return maxLength;
    }

}