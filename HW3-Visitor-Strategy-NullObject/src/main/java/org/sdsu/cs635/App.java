package org.sdsu.cs635;

import org.sdsu.cs635.Tree.*;
import org.sdsu.cs635.Strategy.*;
import org.sdsu.cs635.Visitor.*;

/**
 *
 *
 */
public class App {
    public static void main(String[] args) {
        Strategy s = new ReverseAlpha();
        BinarySearchTree tree = new BinarySearchTree();
        Visitor v = new ConcreteVisitor();

        tree.put("bb");
        tree.put("ac");
        tree.put("ca");
        System.out.println(v.visit(tree));

        tree = new BinarySearchTree(s);
        tree.put("bb");
        tree.put("ac");
        tree.put("ca");
        System.out.println(v.visit(tree));
    }


}
