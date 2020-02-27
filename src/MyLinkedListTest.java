public class MyLinkedListTest {
    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(4);
        linkedListQueue.enqueue(6);
        linkedListQueue.dequeue();
        linkedListQueue.dequeue();
        linkedListQueue.enqueue(9);
        linkedListQueue.enqueue(10);
        linkedListQueue.traverList();
    }
}
