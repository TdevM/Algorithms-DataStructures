package data_structures.queues;

/**
 * Created by Tridev on 27-12-2016.
 */
public interface Queue {

    //Accessor Methods
    boolean isEmpty();
    int size();
    Object front();

    //Update Methods
    void enqueue(Object element);
    void dequeue();
    String printQueue();

}
