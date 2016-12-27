package data_structures.queues;

/**
 * Created by Tridev on 27-12-2016.
 */
public class QueueImplemeted {

    public static void main(String[] args) {
        QueueAsArray queueAsArray = new QueueAsArray();
        queueAsArray.enqueue(1);
        queueAsArray.enqueue(2);
        queueAsArray.enqueue(3);
        queueAsArray.enqueue(4);
        queueAsArray.enqueue(5);
        queueAsArray.enqueue(6);
        queueAsArray.enqueue(7);
        queueAsArray.enqueue(8);
        queueAsArray.enqueue(9);
        try {
            System.out.println(queueAsArray.front());
        }catch (Exception e){
            System.out.println("Queue Empty");
        }

        System.out.println(queueAsArray.isEmpty());
        System.out.println(queueAsArray.printQueue());
        queueAsArray.dequeue();
        System.out.println(queueAsArray.printQueue());
        queueAsArray.enqueue(6);
        System.out.println(queueAsArray.printQueue());
        System.out.println(queueAsArray.front());

    }

}
