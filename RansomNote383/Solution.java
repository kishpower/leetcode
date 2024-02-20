package RansomNote383;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0;i<magazine.length();i++){
            char c= magazine.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }

        for (int j=0;j<ransomNote.length();j++){
            char c = ransomNote.charAt(j);
            if (map.containsKey(c) && map.get(c) > 0){
                map.put(c,map.get(c) - 1);
            }else {
                return false;
            }
        }
        return true;
    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//        if (ransomNote.length() > magazine.length()) return false;
//        int[] alphabets_counter = new int[26];
//
//        for (char c : magazine.toCharArray())
//            alphabets_counter[c-'a']++;
//
//        for (char c : ransomNote.toCharArray()){
//            if (alphabets_counter[c-'a'] == 0) return false;
//            alphabets_counter[c-'a']--;
//        }
//        return true;
//    }
}
