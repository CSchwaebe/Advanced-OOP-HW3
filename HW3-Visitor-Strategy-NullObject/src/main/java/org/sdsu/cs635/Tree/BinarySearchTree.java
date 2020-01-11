package org.sdsu.cs635.Tree;

import org.sdsu.cs635.Visitor.Visitor;
import org.sdsu.cs635.Node.*;
import org.sdsu.cs635.Strategy.*;

public class BinarySearchTree {
    private Node root;
    private int size;
    private Strategy strategy;
    
    public BinarySearchTree() {
        root = TreeNode.nullNode;
        size = 0;
        strategy = new Alphabetical();
    }

    public BinarySearchTree(Strategy strategy) {
        root = TreeNode.nullNode;
        size = 0;
        this.strategy = strategy;
    }

    public boolean put(String value) {
        Node newNode = new TreeNode(value, strategy);
        try {
            root = root.put(newNode);
        } catch (Exception e) {
            return false; //in case of duplicate key
        }  
        size++;
        return true;
    }

    public String accept(Visitor v) {
        return v.visit(this.root);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        root = TreeNode.nullNode;
        size = 0;
    }
}
   
    
