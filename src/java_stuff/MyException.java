package java_stuff;

import data_structures.stacks.StackEmptyException;

/**
 * Created by Tridev on 26-12-2016.
 */
public class MyException {


    public static void main(String[] args) {
        MyException myException = new MyException();
    try {
        myException.testException("HeR");                // Exception Handled using Try-Catch Blocks
    }catch (Exception e){
        System.out.println("Error: Your String Contains R");
    }
      //  myException.testException("rrrrrrrrrR");     // Unhandled Exception
    }

    private void testException(String s) {
        if (s.endsWith("R")) {
            throw new StackEmptyException("Error. String must not end with 'R'. tdevm.java.EndsWithRException");
        }
    }
}
