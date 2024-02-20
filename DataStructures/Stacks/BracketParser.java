package DataStructures.Stacks;

import java.util.*;
import java.util.Stack;

/*
    verify if [{}](),{}[]() are valid patterns

 */
public class BracketParser {
    public static void main(String[] args) {
        System.out.println(soln("[{}]()"));
        System.out.println(soln("{}[]()"));
        System.out.println(soln("()){}"));
    }

   public static boolean soln(String pattern){
       Stack<Character> stack = new Stack<>();
//       Character[] leftBrackets = new Character[]{'{','[','('};
       List<Character> leftBrackets = List.of('{', '[', '(');
//       Character[] rightBrackets = new Character[]{'}','[',')'};
       List<Character> rightBrackets = List.of('}', ']', ')'); // immutable list
//       List<Character> list = new LinkedList<>(Arrays.asList('}', ']', ')')); //mutable
//       list.add(3,'}');
//       System.out.println(list + " list");
//       rightBrackets.add(3,'>'); // exception - unsupported operation
       Character currentChar = null;
       Character reversedChar = null;

       if (pattern ==  "") return  true;
       if (pattern.length() % 2 != 0) return false;
       for (int i=0; i < pattern.length(); i ++){
           currentChar = pattern.charAt(i);
           reversedChar = reversedChar(currentChar);
           if (leftBrackets.contains(currentChar)) stack.push(currentChar);
           else {
               if (stack.isEmpty() || stack.pop() != reversedChar)return false;
           }
       }

       return stack.isEmpty();
   }

   public static char reversedChar(char c){
        switch (c){
            case '{':return '}';
            case '(': return ')';
            case '[': return ']';
            case '}': return  '{';
            case ']': return '[';
            case  ')': return '(';
            default:
                throw new RuntimeException("cannot reversed the character");
        }
   }
}
