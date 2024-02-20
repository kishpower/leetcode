package DataStructures;

import java.util.Iterator;

public class DoublyLL<T> implements Iterable<T>{
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public Node<T> getHead() {
        return head;
    }

    private class Node<T>{
        T data;
        Node<T> prev,next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public void clear(){
        Node<T> trav = head;
        while(trav != null){
            Node<T> next = trav.next;
            trav.next = trav.prev = null;
            trav.data = null;
            trav = next;
        }
        head = tail = null;
        size = 0;
    }

    public int size(){
        return  size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void add(T element){
        addLast(element);
    }

   public void addLast(T element) {
        if (isEmpty()){
            head = tail = new Node<>(element,null,null);
        }else {
            Node<T> temp = new Node<>(element, tail, null);
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public T peekFirst(){
        if (isEmpty()) throw new RuntimeException("Empty List");
        return head.data;
    }

    public T peekLast(){
        if (isEmpty()) throw new RuntimeException("Empty list");
        return tail.data;
    }

    public T removeFirst(){
       if (isEmpty()) throw new RuntimeException("Empty List");
       T data = head.data;
       head = head.next;
       size--;

       if (isEmpty()) tail = null;
       else head.prev = null;

       return data;
    }
    public  void addFirst(T element){
        if (isEmpty()){
            head = tail = new Node<>(element,null,null);
        }else {
            Node<T> temp = new Node<>(element,null,head);
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    public void addAtIndex(int index,T element){
        if (index<0 || index>size) throw new RuntimeException("Index out of bound");
        if (index == 0){
            addFirst(element);
            return;
        }
        if (index == size-1){
            addLast(element);
            return;
        }
        Node<T> trav = head;
        for (int i = 0;i<index-1;i++){
            trav = trav.next;
        }
        Node<T> temp = new Node<>(element, trav, trav.next);
        trav.next = temp;
        trav.next.prev = temp;

        size++;
    }

    public T removeLast(){
        if (isEmpty()) throw new RuntimeException("Empty list");
        T data = tail.data;
        tail = tail.prev;
        size--;

        if (isEmpty()) head = null;
        else tail.next = null;
        return data;
    }

    private T remove(Node<T> node){
        if (node.prev == null) return removeFirst();
        if (node.next == null) return removeLast();

        node.next.prev = node.prev;
        node.prev.next = node.next;
        node = node.next = node.prev = null;
        T data = node.data;
        node.data = null;
        --size;
        return  data;
    }

    private T removeAt(int index){
        if (index < 0 || index>=size) throw new IllegalArgumentException();
        int i;
        Node <T> trav;

        if (index < size/2){
            for (i=0,trav = head;i!= index;i++){
                trav = trav.next;
            }
        }else {
            for (i=size-1,trav = tail;i!=index;i--){
                trav = trav.prev;
            }
        }
        return remove(trav);
    }

    public boolean remove(Object obj){
        Node<T> trav;
        if (obj == null){
            for (trav = head ; trav!=null ;trav = trav.next){
                if (trav.data == null){
                    remove(trav);
                    return true;
                }
            }
        }else {
            for (trav = head; trav!=null; trav = trav.next){
                if (trav.data.equals(obj)){
                    remove(trav);
                    return true;
                }
            }
        }
        return  false;
    }

    public int indexOf(Object obj){
        Node<T> trav;
        int index = 0;
        if (obj == null){
            for (trav=head;trav!=null;trav=trav.next,index++){
                if (trav.data == null){
                   return index;
                }
            }
        }else {
            for (trav = head;trav!=null;trav = trav.next,index++){
                if (trav.data.equals(obj)){
                    return  index;
                }
            }
        }
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj)!=-1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> trav = head;
            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }
   @Override
    public String toString(){
        Node<T> trav;
       StringBuilder result = new StringBuilder();
       result.append("Doubly LL {\n");
       for (trav= head;trav.next!=null;trav=trav.next){
           result.append(trav.data + " <--> ");
       }
       return result.append(trav.data + "\n}").toString();
   }

    public static void main(String[] args) {
        DoublyLL<Object> dll = new DoublyLL(); //can be <String>/<Object>
        dll.add("Hi");
        dll.add("My");
        dll.add("Name");
//        System.out.println("dll = " + dll); //Hi <--> My <--> Name
        dll.remove("Hi");
//        System.out.println("dll = " + dll); //  My <--> Name
        dll.addFirst("hello");
//        System.out.println("dll = " + dll); // hello <--> My <--> Name
        dll.addLast("Is");
//        System.out.println("dll = " + dll); // hello <--> My <--> Name <--> Is
        dll.remove(dll.getHead());
//        System.out.println(dll); // My <--> Name <--> Is
        dll.addAtIndex(0,"hola");
//        System.out.println("dll = " + dll); // hola <--> My <--> Name <--> Is
        dll.addAtIndex(4,"Ganesh");
//        System.out.println("dll = " + dll); // hola <--> My <--> Name <--> Is <--> Ganesh
        dll.addAtIndex(0,1);
//        System.out.println("dll = " + dll);

    }


}
