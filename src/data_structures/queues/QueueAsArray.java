package data_structures.queues;

import java.util.Arrays;

/**
 * Created by Tridev on 27-12-2016.
 */
public class QueueAsArray implements Queue {

    public static final int CAPACITY = 10;
    private int maxCapacity;
    private Object[] queueInstance;
    private int front = 0;
    private int rear = 0;

    public QueueAsArray(){
        this(CAPACITY);
    }

    public QueueAsArray(int cap){
        this.maxCapacity = cap;
        queueInstance = new Object[cap];
    }
    @Override
    public boolean isEmpty() {
        return (front==rear);
    }

    @Override
    public int size() {
        return (maxCapacity-front+rear)%maxCapacity;
    }

    @Override
    public Object front() {
        if (isEmpty()){
            throw new QueueEmptyException("Queue is empty, cannot return front");
        }
        return queueInstance[front];
    }

    @Override
    public void enqueue(Object element) {
        if (size()== maxCapacity-1)
            throw new QueueFullException("Cannot Enqueue, Queue is Full");
        queueInstance[rear]  = element;
        rear = (rear+1)%maxCapacity;                //Doing  (rear+1)%maxCapacity helps in making a wrap-around configuration of the queue
                                                    //So, When rear becomes maxCapacity-1, it does not let it increment the rear.instead it makes it 0
    }

    @Override
    public void dequeue() {
        if (isEmpty()){
            throw  new QueueEmptyException("Queuue is Empty");
        }
        queueInstance[front] = null;
       front = (front+1)%maxCapacity;
    }

    @Override
    public String printQueue() {
        String s;
        System.out.println(Arrays.toString(queueInstance));
        return "";
    }

    @Override
    public String toString() {
        String s;
        for(int i=0;i<queueInstance.length;i++){
            s = queueInstance[i].toString();
            System.out.println(s);
        }
        return super.toString();
    }
}
