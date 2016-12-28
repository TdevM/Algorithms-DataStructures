package data_structures.trees.binary_search_tree;


/**
 * Created by Tridev on 28-12-2016.
 */
public interface BST {
    void insertValue(int value);
    void insertNode(Node node);
    void insertNode(Node currentNode, Node newNode);
    Node getNode(Node currentNode, int value);
    boolean containsValue(int value);
//    String printPostOrderTraversal(Node rootNode);
//    String printPreOrderTraversal(Node rootNode);
//    String printInOrderTraversal(Node rootNode);
}
