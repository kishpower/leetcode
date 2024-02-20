package WordPattern290;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        wordPattern("abba","dog cat cat dog");
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();

        String[] splittedString = s.split(" ");

        if (splittedString.length != pattern.length()) return false;
        for (int i =0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if (!map.containsKey(c) && !map.containsValue(splittedString[i])){
                map.put(c,splittedString[i]);
            }
            else if (map.get(c)== null || !map.get(c).equals(splittedString[i])){
                return false;
            }
        }

        return true;
    }
}
