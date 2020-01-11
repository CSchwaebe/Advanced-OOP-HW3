package org.sdsu.cs635.Node;
import org.sdsu.cs635.Visitor.Visitor;
import org.sdsu.cs635.Strategy.Strategy;

public class TreeNode implements Node {
    private String value;
    private Node leftChild;
    private Node rightChild;
    private Strategy strategy;

    public static Node nullNode = new NullNode();
    
    public TreeNode(String v, Strategy s) {
        value = v;
        strategy = s;
        leftChild = rightChild = TreeNode.nullNode;
    }

    public boolean isNull() { return false; }

    public int compareTo(Node node) {
        if (node.isNull()) {
            throw new NullPointerException(); // From compareTo Documentation
        } else
            return strategy.compare(this, node);
    }

    public Node put(Node node) {
        int result = compareTo(node);
        if (result > 0) {
            leftChild = leftChild.put(node);
            return this;
        } else if (result < 0) {
            rightChild = rightChild.put(node);
            return this;
        } else 
            throw new UnsupportedOperationException(); //duplicate
    }

    public String accept(Visitor v) {
        return v.visit(this);
    }

    public String getValue() { return value; }
    public Node getLeftChild() { return leftChild; }
    public Node getRightChild() { return rightChild; }
    public void setLeftChild(Node node) { leftChild = node; }
    public void setRightChild(Node node) { rightChild = node; }
}

