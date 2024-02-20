package DataStructures.Queues;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Queue<T> implements Iterable<T>{
    List<T> ll = new LinkedList<>();
//    List list;
    public Queue(T element){
       enqueue(element);
    }

    private void enqueue(T element) {
        ll.add(element);
    }

    public T dequeue(){
        if (isEmpty()) throw new EmptyStackException();
       return  ll.remove(0);
    }

    public T peekFirst(){
        if(isEmpty()) throw new EmptyStackException();
        return ll.get(0);
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public int size(){
        return this.ll.size();
    }


    @Override
    public Iterator<T> iterator() {
        return ll.iterator();
    }

}
