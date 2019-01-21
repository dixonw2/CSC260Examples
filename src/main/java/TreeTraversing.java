import java.util.ArrayList;

// WIP

public class TreeTraversing {
    public static void main(String[] args) {
        Tree example = new Tree(4);
        example.inOrder();
    }
}

class Tree {
    private Node root;

    public Tree(int n) {
        root = new Node(null, 0);
        createTree(root, n, 1);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.getLeftChild());
        System.out.println(root.getData() + " ");
        inOrder(root.getRightChild());
    }

    private void createTree(Node root, int n, int data) {
        if (n <= 0)
            return;

    }

}

class Node {
    private Node leftChild, rightChild, previous;
    private int data;

    public Node(Node previous, int data) {
        this.previous = previous;
        this.data = data;
    }

    //getters
    public Node getPrevious() {
        return previous;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public int getData() {
        return data;
    }

    //setters
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

}
