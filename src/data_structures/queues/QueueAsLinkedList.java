package data_structures.queues;

import data_structures.linked_list.MyLinkedList;

/**
 * Created by Tridev on 27-12-2016.
 */

/**
 *  Implemented using doubly linked list, as a singly linked list is inefficient in removal from tail.
 */
public class QueueAsLinkedList  implements Queue{


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object front() {
        return null;
    }

    @Override
    public void enqueue(Object element) {


    }

    @Override
    public void dequeue() {

    }

    @Override
    public String printQueue() {
        return null;
    }
}
