public class queuesTest {
    public static void main(String[] args) {
        Queues q = new Queues();
    //     Queues queue = new Queues();
        q.enqueue("first in queue");
        q.enqueue("second in queue");
        q.enqueue("third in queue");

        q.printQueue();

        System.out.println();
        System.out.println("dequeue: ");
        q.denueue();
        q.printQueue();
        System.out.println("first queue removed");

    }
}