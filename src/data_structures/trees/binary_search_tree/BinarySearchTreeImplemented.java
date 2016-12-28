package data_structures.trees.binary_search_tree;

/**
 * Created by Tridev on 28-12-2016.
 */
public class BinarySearchTreeImplemented {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertValue(10);
        binarySearchTree.insertValue(7);
        binarySearchTree.insertValue(6);
        binarySearchTree.insertValue(2);
        binarySearchTree.insertValue(5);
        binarySearchTree.insertValue(1);
        binarySearchTree.insertValue(8);
        binarySearchTree.insertValue(9);
        binarySearchTree.insertValue(4);
        binarySearchTree.insertValue(3);
        System.out.println("The BST is: "+binarySearchTree.toString());

        System.out.println(binarySearchTree.printInOrderTraversal());
        System.out.println(binarySearchTree.printPostOrderTraversal());
        System.out.println(binarySearchTree.printPreOrderTraversal());

    }
}
