package GenerateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recurse(ans, 0 , 0 , "" , n);
        return ans;
    }

    public static void recurse(List<String> list , int open , int close , String str , int n){
        if (str.length() == n * 2){
            list.add(str);
            return;
        }

        if (open < n){
            recurse(list , open + 1 , close , str + "(" , n);
        }

        if (close < open){
            recurse(list , open  , close + 1, str + ")" , n);
        }

    }
}
