package MinStack155;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> minVal;

    public MinStack() {
        this.stack = new Stack<>();
        this.minVal = new Stack<>();
    }

    public void push(int val) {
        if (minVal.isEmpty() || minVal.peek() >= val) minVal.push(val);
        stack.push(val);
    }



    public void pop() {
        if (stack.isEmpty()) throw new RuntimeException();
        else if (stack.pop().equals(minVal.peek())) {
            minVal.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minVal.peek();
    }

    public static void main(String[] args) {

  MinStack obj = new MinStack();
  obj.push(512);
obj.push(-1024);
    obj.push(-1024);
    obj.push(512);
      obj.pop();
        System.out.println(obj.getMin());
    obj.pop();
        System.out.println(obj.getMin());
    obj.pop();
        System.out.println(obj.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 **/
