package data_structures.stacks;

import java.util.EmptyStackException;

/**
 * Created by Tridev on 26-12-2016.
 */
public interface Stack {

    //Accessor Methods
     int size();
     boolean isEmpty();
     Object top() throws StackEmptyException;

    //Update Methods
     void push(Object element);
     Object pop() throws StackEmptyException;
     String printStack();
}
