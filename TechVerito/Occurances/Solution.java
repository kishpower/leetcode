package TechVerito.Occurances;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(       findOccurances("bbccddezz")
        );
    }

    private static String findOccurances(String given) {
        HashMap<Character, Integer> map = new HashMap<>();

        // store occurances in hashmap
        for (int i = 0 ; i < given.length();i++){
            char c = given.charAt(i);
            if (!map.containsKey(c)) map.put(c,1);
            else {
                map.put(c,map.get(c) + 1);
            }
        }
            // output them in a string
        StringBuilder output = new StringBuilder();
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();

        for (int i = 0 ; i < map.size() ; i++){
            Map.Entry<Character, Integer> entry = iterator.next();
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) output.append(key);
            else output.append(key + ""+value);
        }

        return output.toString();
    }

}
