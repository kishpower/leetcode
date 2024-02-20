package ValidAnagram242;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","naagrma"));
    }
//    public static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        HashMap<Character,Integer> map1 = new HashMap<>();
//        if (s.length() != t.length()) return  false;
//        for (int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if (!map.containsKey(c)){
//                map.put(c,1);
//            }else {
//                map.put(c,map.get(c) + 1);
//            }
//        }
//
//        for (int i=0;i<t.length();i++){
//            char c = t.charAt(i);
//            if (!map1.containsKey(c)){
//                map1.put(c,1);
//            }else {
//                map1.put(c,map1.get(c) + 1);
//            }
//        }
//
//        return map.equals(map1);
//    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (!map.containsKey(c))
             map.put(c, 1);

            else {
                map.put(c, map.get(c) + 1);
            }
        }

        for(int i = 0 ; i < t.length(); i++){
            char c = t.charAt(i);
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0 ) map.remove(c);
        }

       return map.isEmpty();
    }

//    public static boolean isAnagram(String s, String t) {
//        char[] sChars = s.toCharArray();
//        char[] tChars = t.toCharArray();
//
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//
//        return Arrays.equals(sChars, tChars);
//    }

//    public boolean isAnagram(String s, String t) {
//        Map<Character, Integer> count = new HashMap<>();
//
//        // Count the frequency of characters in string s
//        for (char x : s.toCharArray()) {
//            count.put(x, count.getOrDefault(x, 0) + 1);
//        }
//
//        // Decrement the frequency of characters in string t
//        for (char x : t.toCharArray()) {
//            count.put(x, count.getOrDefault(x, 0) - 1);
//        }
//
//        // Check if any character has non-zero frequency
//        for (int val : count.values()) {
//            if (val != 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
