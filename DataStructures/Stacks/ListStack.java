package DataStructures.Stacks;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class ListStack<T> implements Iterable<T>,Stack<T>{
    private LinkedList<T> ll = new LinkedList<>();

    ListStack(T element){
       push(element);
    }

    public void push(T element) {
        ll.addLast(element);
    }

    public T pop(){
        if (isEmpty()) throw new EmptyStackException();
        return ll.removeLast();
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }

    public int size(){
        return ll.size();
    }




    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
