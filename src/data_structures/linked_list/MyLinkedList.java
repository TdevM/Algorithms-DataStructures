package data_structures.linked_list;

/**
 * Created by Tridev on 25-12-2016.
 */
public class MyLinkedList {

    public static int counter;
    private Node head;


    public MyLinkedList() {

    }

    private static void incrementCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    private void decrementCounter() {
        counter--;
    }

    public int size() {
        return getCounter();
    }

    void addElement(Object data) {

        if (head == null) {
            head = new Node(data);
        }

        Node tempNode = new Node(data);
        Node currentNode = head;

        if (currentNode != null) {

            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(tempNode);
        }
        incrementCounter();
    }

    void insertElementAt(Object data, int index) {

//        if (head == null) {
//            head = new Node(data);
//        }
        if (head == null)
            return;

        Node tempNode = new Node(data);
        Node currentNode = head;

        if (currentNode != null) {
            for (int i = 0; i < index && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
            tempNode.setNext(currentNode.getNext());
            currentNode.setNext(tempNode);
        }
        incrementCounter();
    }


    void insertAtHead(Object data) {
        if (head == null) {
            head = new Node(data);
        }
        Node tempNode = new Node(data);
        Node currentNode = head;
        tempNode.setNext(currentNode.getNext());
        head.setNext(tempNode);
        incrementCounter();
    }

    public Object getElementAt(int index) {

        if (index < 0)
            return null;
        Node tempNode = null;
        if (head != null) {
            tempNode = head.getNext();
            for (int i = 1; i < index; i++) {
                if (tempNode.getNext() == null)
                    return null;
                tempNode = tempNode.getNext();

            }
            return tempNode.getData();
        }
        return tempNode;
    }

    void removeElementAt(int index) {

        if (index < 1 || index > size())
            return;
        Node tempNode = head;
        if (head != null) {
            for (int i = 1; i < index; i++) {
                if (tempNode.getNext() == null)
                    return;
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
        decrementCounter();
    }

    // To Print the Linked List
    public String toString() {
        String output = "";

        if (head != null) {
            Node tempNode = head.getNext();
            while (tempNode != null) {
                output += "[" + tempNode.getData().toString() + "]";
                tempNode = tempNode.getNext();
            }

        }
        return output;
    }


}
