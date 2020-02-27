import java.util.ArrayList;

public class LinkedListQueue {

    private class Node {
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
        }
    }

    private Node head;
    public Node tail;

    public LinkedListQueue() {
    }

    public void enqueue(int key) {
        Node value = new Node(key);
        if (this.head==null){
            this.head = this.tail = value;
            return;
        }
        this.tail.next = value;
        this.tail = value;
    }

    public Node dequeue() {
        if (this.head==null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head==null){
            this.tail = null;
        }
        return temp;
    }

    public void traverList() {
        Node current = head;
        while (current!=null){
            System.out.println(current.key);
            current = current.next;
        }
    }
}
