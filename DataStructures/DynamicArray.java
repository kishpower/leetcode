package DataStructures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable <T> {
    private  T[] arr;
    private int len = 0; //what the user thinks the length is
    private int capacity = 0; //what the actual length is

    public DynamicArray(){
        this(16);
    }
    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity");
        }
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return  len;
    }

    public boolean isEmpty(){
        return this.len == 0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index,T element){
       arr[index]=element;
    }

    public void clear(){
        for (int i = 0; i < this.capacity;i++){
            arr[i] = null;
        }
        len = 0;
    }

    public void add(T element){
        if (len >= capacity){
            if (capacity == 0) capacity = 1;
            else  capacity = capacity * 2;
            T[] newArray = (T[]) new Object[capacity];
//            T[] newArray = new T[capacity];
            for (int i =0 ;i < len ;i++){
                newArray[i]= arr[i];
            }
            newArray[len] = element;
            arr = newArray; //arr has extra null padded
        }else {
            arr[len]=element;
        }
        len++;
    }

    public T removeAt(int rm_index){
       if (rm_index < 0 || rm_index >= len){
           throw new IndexOutOfBoundsException();
       }
       T data = arr[rm_index];
        T[] newArray = (T[]) new Object[len - 1];
//        T[] newArray = new T[len-1];
       for (int i=0,j=0;i<len;i++,j++){
           if (i == rm_index){
               j--;
           }else {
               newArray[j] = arr[i];
           }
       }
       arr = newArray;
       len--;
       capacity = len;
       return data;
    }

    public boolean remove(Object obj){
        for (int i = 0;i < capacity;i++){
            if (arr[i].equals(obj)) {
                removeAt(i);
                return  true;
            }
        }
        return  false;
    }

    public int indexOf(Object obj){
        for (int i =0;i<capacity;i++){
            if (arr[i].equals(obj)){
                return i;
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
            int index;
            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }

    public static void main(String[] args){
        int choice =0;
        DynamicArray<Integer> da = null;
        Scanner scanner= new Scanner(System.in);
      while (choice == 0){
          System.out.println("*******");
          System.out.println("Choose an operation");
          System.out.println("1.Create default Dynamic array with size 16");
          System.out.println("2.Create array with a capacity");
          choice =  scanner.nextInt();
          switch (choice) {
              case 1: da = new DynamicArray<>();
                        break;
              case 2:
                  System.out.println("give capacity:");
                  int size = scanner.nextInt();
                  da = new DynamicArray<>(size);
                  break;
              default:
                  System.out.println("invalid option selected !");
          }
      }
        System.out.println("*******");
      choice = 0;
      while (choice >= 0){
          System.out.println("*******");
          System.out.println("1.Add an element");
          System.out.println("2.Remove an element");
          System.out.println("3.Remove an element at an index");
          System.out.println("4.Print the array");
          System.out.println("5.exit");
          choice = scanner.nextInt();
          switch (choice){
              case 1: int element = scanner.nextInt();
                        da.add(element);
                        break;
              case 2:
                  String number = scanner.next();
                  da.remove(Integer.parseInt(number));
                  break;

              case 3:
                  int rm_index= scanner.nextInt();
                  da.removeAt(rm_index);
                    break;
              case 4:
                  System.out.println(da.toString());
                  break;

              case 5:
                    choice = -1;
                  break;
              default:
                  System.out.println("Invalid choice.Try Again..");
          }
      }
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public String toString() {
       if (len == 0) return "[]";
       else {
           StringBuilder sb = new StringBuilder(len).append("[");
           for(int i=0;i < len-1;i++)
               sb.append(arr[i]+", ");
           return sb.append(arr[len-1]+"]").toString();
       }
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
