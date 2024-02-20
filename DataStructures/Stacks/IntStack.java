package DataStructures.Stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class IntStack<T> implements Stack<T>{
    private T[] arr;
    private int maxSize = 5;
    public IntStack(int maxSize) {
        this.arr  = (T[])new Object[maxSize];
//        Arrays.fill(this.arr,0); // if you want to initialise values to 0 instead of null;
        this.maxSize = maxSize;
    }

    private int pos =  0;

    @Override
    public void push(T element) {
        if (pos >= maxSize) throw new IllegalArgumentException();
        arr[pos] = element;
        pos++;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T data = arr[--pos];
        arr[pos] = null;
        return data;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return pos;
    }

    @Override
    public String toString() {
        return "IntStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args){
        IntStack<Integer> intStack = new IntStack<>(2);
//        System.out.println(intStack); // IntStack{arr=[null, null]}
        intStack.push(1);
        intStack.push(2);
//        intStack.push(3) ; // error index out of bound exception
//        System.out.println("intStack = " + intStack);
        intStack.pop();
        System.out.println("intStack = " + intStack);
    }
}
