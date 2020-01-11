package org.sdsu.cs635.Node;

import org.sdsu.cs635.Visitor.Visitor;

public interface Node extends Comparable<Node> {
   
    public boolean isNull();

    public Node put(Node node);

    public String accept(Visitor v);

    public String getValue();
    
    public Node getLeftChild();

    public Node getRightChild();

    public void setLeftChild(Node node);

    public void setRightChild(Node node);
}
