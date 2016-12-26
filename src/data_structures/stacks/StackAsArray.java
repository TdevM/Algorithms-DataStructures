package data_structures.stacks;

import java.util.Arrays;
import static java.lang.System.out;

/**
 * Created by Tridev on 26-12-2016.
 */

/**
 * The Problem with this implementation is that we are working here on a Upper Bound i.e either hard-coded CAPACITY
 * or user defined maxCapacity,  in this way the objects are also instantiated for the unused elements of the array stackInstance.
 * The arbitrary value of the array may be too small or too large as per the requirement.
 */

public class StackAsArray implements Stack {

    public static final int CAPACITY = 10;
    private int maxCapacity;
    private Object[] stackInstance;
    private int top = -1;

    public StackAsArray(){
        this(CAPACITY);         // Initialize with default hard-coded capacity;
    }

    public StackAsArray(int cap){
        this.maxCapacity = cap;
        stackInstance = new Object[cap];
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return (top<0);
    }

    @Override
    public Object top() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack is Empty, Cannot Return Top");
        return stackInstance[top];
    }

    @Override
    public void push(Object element) throws StackOverflowError{
        if (size()==maxCapacity)
            throw new StackFullException("Stack Overflow, Cannot Push");
        stackInstance[++top] = element;
    }

    @Override
    public Object pop() throws StackEmptyException {
        Object tempElement;
        if (isEmpty())
            throw new StackEmptyException("Stack is Empty, Cannot Pop");
         tempElement = stackInstance[top];
         stackInstance[top--] = null;
        return tempElement;
    }

    @Override
    public String printStack() {
        String s;
        System.out.println(Arrays.toString(stackInstance));
        return "";
    }

    @Override
    public String toString() {                             // To Print the Stack
        String s;
        for (int i=0;i<stackInstance.length;i++){
            s = stackInstance[i].toString();
            out.println(s);
        }
        return "";
    }


}
