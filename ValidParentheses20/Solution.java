package ValidParentheses20;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
     public static void main(String[] args) {
         System.out.println(         isValid("(){}")
         );
     }
    public  static boolean isValid(String s) {
        Stack<Character> stack = new java.util.Stack<>() ;
        if ((s.length() == 0) || (s.length() % 2) != 0) return false;
        List<Character> leftBrackets = List.of('(', '{','[');
        List<Character> rightBrackets = List.of(')', '}', ']');
        for (int i = 0; i < s.length() ; i++){
            Character curr = s.charAt(i);

            if (stack.isEmpty() && rightBrackets.contains(curr)){
                return false;
            }
            if (leftBrackets.contains(curr)) stack.push(curr);
            else if (!stack.isEmpty() && stack.pop()!= reversed(curr)) {
                return false;
            }

        }

        return stack.isEmpty();
    }

    static Character reversed(Character c){
         switch (c){
             case '(': return ')';
             case ')': return '(';
             case '{': return '}';
             case '}': return '{';
             case '[': return ']';
         case ']': return '[';
             default: return null;
         }
    }
}
