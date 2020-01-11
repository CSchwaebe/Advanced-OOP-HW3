package org.sdsu.cs635.Visitor;

import org.sdsu.cs635.Node.*;
import org.sdsu.cs635.Tree.BinarySearchTree;

public class ConcreteVisitor implements Visitor { 
    
    public ConcreteVisitor() { }

    public String visit(Node node) {
        return node.accept(this);
        //The root of the tree could be a TreeNode or a NullNode
        //So root has to be of class Node, it can't be more specific.
        //We shouldn't be doing null checks in our tree so we can only call visit with a Node 
        //We can't split visit into visit(TreeNode) and visit(NullNode)
        //This one method has to handle both.
    }

    public String visit(NullNode node) {
        return "()";
    }

    public String visit(TreeNode node) {
        String s = "(" + node.getValue() + 
        node.getLeftChild().accept(this) + 
        node.getRightChild().accept(this) +
        ")";
        return s;
    }

    public String visit(BinarySearchTree tree) {
        return tree.accept(this);
    }
}