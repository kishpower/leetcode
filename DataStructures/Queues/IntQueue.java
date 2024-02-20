package DataStructures.Queues;

public class IntQueue {
    int[] data;
    int size;   // size of the queue
    int capacity; //actual size aka capacity of the queue

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (int i = this.front,j = 0 ;j<size; i++,j++){
            if (i==capacity) i = i%capacity;
           output.append(" "+data[i]);
        }
        return output.append(" ]").toString();
    }

    int front,end;

    public IntQueue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        front = end = size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void offer(int element){
        if (isFull()) throw new RuntimeException("queue is full");
        data[end++] = element;
        end = end % capacity;
        size++;
    }

    public int poll(){
        if (isEmpty()) throw new RuntimeException("queue is empty");
        size--;
        front = front % capacity;
       return  data[front++];
//       can be done alternatively as :
//        int returnValue = data[front];
//        front = (front + 1) % capacity;
//        return returnValue;
    }

    private boolean isFull() {
       return size == capacity;
    }

    public static void main(String[] args) {

        IntQueue q = new IntQueue(5);

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.println(q.poll()); // 1
        System.out.println(q.poll()); // 2
        System.out.println(q.poll()); // 3
        System.out.println(q.poll()); // 4

        System.out.println(q.isEmpty()); // false

        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.poll()); // 5
        System.out.println(q.poll()); // 1
        System.out.println(q.poll()); // 2
        System.out.println(q.poll()); // 3

        System.out.println(q.isEmpty()); // true

//            benchMarkTest();
    }
    private static void benchMarkTest() {

        int n = 10;
        IntQueue intQ = new IntQueue(n);

        // IntQueue times at around 0.0324 seconds
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) intQ.offer(i);
        System.out.println(intQ + " intQ");
        for (int i = 0; i < n; i++) intQ.poll();
        long end = System.nanoTime();
        System.out.println("IntQueue Time: " + (end - start) / 1e9);

        // ArrayDeque times at around 1.438 seconds
        java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>();
        // java.util.ArrayDeque <Integer> arrayDeque = new java.util.ArrayDeque<>(n); // strangely the
        // ArrayQueue is slower when you give it an initial capacity.
        start = System.nanoTime();
        for (int i = 0; i < n; i++) arrayDeque.offer(i);
        System.out.println("arrayDeque = " + arrayDeque);

        for (int i = 0; i < n; i++) arrayDeque.poll();


        end = System.nanoTime();
        System.out.println("ArrayDeque Time: " + (end - start) / 1e9);
    }


}
