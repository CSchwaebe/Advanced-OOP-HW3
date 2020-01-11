package org.sdsu.cs635.Node;

import org.sdsu.cs635.Visitor.Visitor;

public class NullNode implements Node {
    
    public NullNode() { }

    public boolean isNull() { return true; }

    public int compareTo(Node node) { throw new UnsupportedOperationException(); }

    public Node put(Node node) {
        return node; 
    }

    public String accept(Visitor v) {
        return v.visit(this);
    }

    public String getValue() { return ""; }
    public Node getLeftChild() { throw new UnsupportedOperationException(); }
    public Node getRightChild() { throw new UnsupportedOperationException(); }
    public void setLeftChild(Node node) { throw new UnsupportedOperationException(); }
    public void setRightChild(Node node) { throw new UnsupportedOperationException(); }
}