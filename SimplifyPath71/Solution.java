package SimplifyPath71;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(
                simplifyPath("/.../a/../b/c/../d/./\"")
        );
    }
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directories = path.split("/");

        for (String dir : directories){
//            ignore the directory if empty/"/"
            if (dir.isEmpty() || dir.equals(".")) continue;

            if (dir.equals("..")){
               if (!stack.isEmpty()) stack.pop();
            }else {
                stack.push(dir);
            }
        }

        return "/" + String.join("/",stack);
    }
}
