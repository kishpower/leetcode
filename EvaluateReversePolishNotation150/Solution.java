package EvaluateReversePolishNotation150;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(
                evalRPN(new String[]{"2","1","+","3","*"})
        );
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a,b;
        for (String s : tokens){
            if (s.equals("+")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a + b);
            }else if (s.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a - b);
            }else if (s.equals("*")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a * b);
            }else if (s.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a / b);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
