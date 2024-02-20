package TechVerito.Anagram;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(isAnagram("abc", "caa"));
        printPyramid(10);
    }

    public static void printPyramid(int noOfLines){
//        int k = 2*noOfLines -2;

        for (int i = noOfLines ; i > 0 ; i--){
            for (int j = i ; j >= 0 ; j--){
                System.out.print(" ");
            }
            for (int k = 0 ; k <= noOfLines - i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0 ; i < noOfLines ; i++){
            for (int j = i ; j >= 0 ; j--) System.out.print(" ");
            for (int k = noOfLines - i ; k > 0  ; k--) System.out.print("* ");
            System.out.println();
        }
    }
    public static boolean isAnagram(String input1,String input2){
        if (input1.length() != input2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0 ; i < input1.length() ; i++){
            char c = input1.charAt(i);
            if (!map.containsKey(c)){
               map.put(c,1);
            }else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (int i = 0 ; i < input2.length() ; i++){
            char c = input2.charAt(i);
            if (!map.containsKey(c)) return false;
            else {
                if (map.get(c) == 1) {
                    map.remove(c);
                    continue;
                }
                map.put(c, map.get(c) - 1);
            }

            }

        return map.isEmpty();
        }

}
