package data_structures.trees.binary_search_tree;

/**
 * Created by Tridev on 28-12-2016.
 */
public class Node {              //Node class for BinaryTree

    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(int value) {
        leftNode = null;
        rightNode = null;
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String result = value + "";
        if (leftNode  != null) result = leftNode.toString() + "-" + result;
        if (rightNode != null) result = result + "-" + rightNode.toString();
        return result;
    }
}
