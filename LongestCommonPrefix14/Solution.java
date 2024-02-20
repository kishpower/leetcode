package LongestCommonPrefix14;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"ad"});
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length -1];
        for (int i =0;i<Math.min(first.length(),second.length());i++){
            if (first.charAt(i)!=second.charAt(i)) return ans.toString();
            ans.append(first.charAt(i));
        }

        System.out.println("ans = " + ans);
        return ans.toString();
    }
}
