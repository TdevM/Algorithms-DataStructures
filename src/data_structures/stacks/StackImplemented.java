package data_structures.stacks;

import data_structures.stacks.StackAsArray;

/**
 * Created by Tridev on 27-12-2016.
 */
public class StackImplemented {

    public static void main(String[] args) {
        StackAsArray stackAsArray = new StackAsArray(10);
        stackAsArray.push(5);
        stackAsArray.push(6);
        stackAsArray.push(7);
        stackAsArray.push(8);
        System.out.println(stackAsArray.isEmpty());
        System.out.println(stackAsArray.printStack());
        stackAsArray.pop();
        System.out.println(stackAsArray.printStack());
        System.out.println("Top Element of the Stack: "+ stackAsArray.top());
    }
}
