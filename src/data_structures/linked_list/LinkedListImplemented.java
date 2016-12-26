package data_structures.linked_list;

/**
 * Created by Tridev on 25-12-2016.
 */
public class LinkedListImplemented {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement(9);
        myLinkedList.addElement(6);
        myLinkedList.addElement(0);
        myLinkedList.addElement(2);
        myLinkedList.addElement(4);
        myLinkedList.addElement(1);
        myLinkedList.insertElementAt(7,6);
        myLinkedList.insertElementAt(0,0);
        System.out.println(myLinkedList);
        System.out.println("Element at Position 5: "+myLinkedList.getElementAt(5));
        System.out.println("Size of the Linked List: "+myLinkedList.size());


        myLinkedList.removeElementAt(5);
        System.out.println("Size of the Linked List: "+myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.insertAtHead(100);
        System.out.println("After Inserting to Head: "+myLinkedList);
        System.out.println("Final Size of the Linked List"+myLinkedList.size());

    }
}
