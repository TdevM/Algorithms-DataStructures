package java_collections;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Tridev on 27-12-2016.
 */
public class DictionaryImplementation {

    public static void main(String[] args) {
        Dictionary<Integer,String> dictionary = new Hashtable<>(10);
        Map<Integer,String> map = new HashMap<>(10);
        map.put(1,"Tridev");
        map.put(2,"Mishra");
        map.put(3,"Java");
        map.put(4,"is");
        map.put(5,"love");
        map.put(6,"it");
        map.put(7,"is");
        map.put(8,"the");
        map.put(9,"best");
        map.put(10,"programming");
        map.put(11,"Language");

        System.out.println(map.hashCode());
        System.out.println( map.equals(dictionary));
        System.out.println(  map.entrySet());
        dictionary.put(1,"Tridev");
        dictionary.put(2,"Mishra");
        System.out.println( dictionary.toString());
        System.out.println(map.toString());
    }
}
