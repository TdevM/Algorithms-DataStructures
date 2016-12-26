package java_collections;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Tridev on 25-12-2016.
 */
public class StackImplementation {



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();



        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
