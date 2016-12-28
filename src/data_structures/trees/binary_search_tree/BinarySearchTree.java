package data_structures.trees.binary_search_tree;

/**
 * Created by Tridev on 28-12-2016.
 */
public class BinarySearchTree implements BST {

    private Node rootNode;




    @Override
    public void insertValue(int value) {
        insertNode(new Node(value));
    }

    @Override
    public void insertNode(Node newNode) {
        if (rootNode == null) {
            rootNode = new Node(newNode.getValue());
        } else {
            insertNode(rootNode, newNode);
        }

    }

    @Override
    public void insertNode(Node currentNode, Node newNode) {
        if (newNode.getValue() < currentNode.getValue()) {
            if (currentNode.getLeftNode() == null){
                currentNode.setLeftNode(newNode);
            }else{
                insertNode(currentNode.getLeftNode(), newNode);
            }
        }else if (newNode.getValue() > currentNode.getValue()) {
            if (currentNode.getRightNode() == null) {
                currentNode.setRightNode(newNode);
            } else {
                insertNode(currentNode.getRightNode(), newNode);
            }
        }

    }

    @Override
    public Node getNode(Node currentNode, int value) {
        if (currentNode.getValue() == value)
            return currentNode;

        if (currentNode.getValue() < value) {
            return getNode(currentNode.getRightNode(), value);
        } else
            return getNode(currentNode.getLeftNode(), value);
    }

    @Override
    public boolean containsValue(int value) {
        if (getNode(rootNode, value) == null) {
            return false;
        }
        return true;
    }

   private void inOrder(Node rootNode){
       if(rootNode==null)
           return;
       inOrder(rootNode.getLeftNode());
       System.out.print(rootNode.getValue()+" ");
       inOrder(rootNode.getRightNode());
   }

   private void postOrder(Node rootNode){
       if(rootNode==null)
           return;
       postOrder(rootNode.getLeftNode());
       postOrder(rootNode.getRightNode());
       System.out.print(rootNode.getValue()+" ");
   }

   private void preOrder(Node rootNode){
       if(rootNode==null)
           return;
       System.out.print(rootNode.getValue()+" ");
       preOrder(rootNode.getLeftNode());
       preOrder(rootNode.getRightNode());
   }

    public String printPostOrderTraversal() {
       postOrder(rootNode);
       return "";
    }

    public String printPreOrderTraversal() {
        preOrder(rootNode);
       return "";
    }


    public String printInOrderTraversal() {
        inOrder(rootNode);
        return "";
    }

    @Override
    public String toString() {
        if (rootNode != null) {
            return rootNode.toString();
        }
        return "";
    }
}
