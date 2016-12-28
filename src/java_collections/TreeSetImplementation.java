package java_collections;

import java.util.TreeSet;

/**
 * Created by Tridev on 28-12-2016.
 */
public class TreeSetImplementation {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}
