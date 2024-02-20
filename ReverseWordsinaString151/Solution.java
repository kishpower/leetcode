package ReverseWordsinaString151;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
//    public static String reverseWords(String s) {
//        String[] tokens = s.split(" ");
//
//        List<String> collect = Arrays.stream(tokens).filter(token -> !token.equals("")).collect(Collectors.toList());
//        String ans = "";
//
//        for (int i = collect.size() - 1; i>0 ; i--){
//            ans += collect.get(i)  + " ";
//        }
//
//        return ans + collect.get(0);
//    }

    public static String reverseWords(String s){
        //regex for selecting white spaces -> \s+
        String[] tokens = s.split("\s+");
                String ans = "x";

        for (int i = tokens.length - 1; i>0 ; i--){
            ans += tokens[i]  + " ";
        }

        return ans + tokens[0] + 'x';
    }
}
