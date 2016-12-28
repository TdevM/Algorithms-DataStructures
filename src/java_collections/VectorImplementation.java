package java_collections;

import java.util.*;

/**
 * Created by Tridev on 25-12-2016.
 */
public class VectorImplementation {

    public static void main(String[] args) {

        Vector<Integer> integerVector = new Vector<>();          //Integer Type Vector (Homogeneous)
        Vector<Object> genericVector = new Vector<>();           //Generic Type Vector (Heterogeneous)
        List<Integer> integersList = new ArrayList<>();          //ArrayList
        Vector<List> listVector = new Vector<>();                //List Type Vector to be sorted


        //Filled  integerVector with Integer elements
        for (int i = 0; i < 10; i++) {
            integerVector.addElement(i + 1);
        }


        //Filled genericVector with Heterogeneous data elements
        genericVector.addElement(1);
        genericVector.addElement(2);
        genericVector.addElement("Hello");
        genericVector.addElement("World");
        genericVector.addElement(4.01F);
        genericVector.addElement(6.00F);
        genericVector.addElement(0.1F);


        //Scanner class used to take Input integersList from user
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            integersList.add(scanner.nextInt());
        }


        //Filled listVector with previously scanned integersList
        listVector.add(integersList);


        //Sorted arrayList
        Collections.sort(integersList);

//        Iterator iterator2 = listVector.iterator();
//        while (iterator2.hasNext()){
//            System.out.println("List Vector Elements: "+iterator2.hasNext());
//        }

        //Iterating  integerVector using for-each loop
        for (Object aVector : integerVector) {
            System.out.println(aVector);
        }

        //Iterating genericVector using Iterator
        Iterator iterator = genericVector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
