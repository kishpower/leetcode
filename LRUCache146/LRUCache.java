package LRUCache146;

import DataStructures.Node;

import java.util.*;

public class LRUCache {

    Map<Integer, Node> map;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        if (map.get(key) == null) return -1;

        Node node = map.get(key);
        deleteNode(node);
        addNode(node);
        map.put(key, head.next);
        return head.next.value;
    }

    public void addNode(Node node){
       Node temp = head.next;
       node.next = temp;
       node.prev = temp.prev;
       head.next = node;
       temp.prev = node;
    }

    public void deleteNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void put(int key, int value) {
        if (map.get(key) != null){ //use containsKey method
           Node node = map.get(key);
           deleteNode(node);
           node.value = value;
           addNode(node);
           map.put(key , head.next);
        }else {
            Node node;
            if (map.size() == capacity){
                node = tail.prev;
                deleteNode(node);
                Node node1 = new Node(key, value);
                addNode(node1);
                map.remove(node.key);
            }else {
                node = new Node(key, value);
                addNode(node);
            }
            map.put(key, head.next);
        }
    }
}