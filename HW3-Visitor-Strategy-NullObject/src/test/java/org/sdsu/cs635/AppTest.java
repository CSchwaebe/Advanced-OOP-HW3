package org.sdsu.cs635;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.sdsu.cs635.Strategy.*;
import org.sdsu.cs635.Tree.BinarySearchTree;
import org.sdsu.cs635.Visitor.*;
import org.sdsu.cs635.Node.*;

public class AppTest {
    @Test
    public void testTreeConstructor() {
        BinarySearchTree t = new BinarySearchTree();
        assertTrue(t.isEmpty());
    }
  
    @Test
    public void testTreePut() {
        BinarySearchTree t = new BinarySearchTree();
        t.put("Testing");
        t.put("One");
        t.put("Two");
        t.put("Three");
        assertTrue(t.size() == 4);
    }

    @Test
    public void testAlphabeticalStrategy() {
        BinarySearchTree t = new BinarySearchTree();
        Strategy s = new Alphabetical();
        Node c = new TreeNode("cat", s);
        Node a = new TreeNode("apple", s);
        assertTrue(c.compareTo(a) > 0);
    }

    @Test
    public void testReverseAlphaStrategy() {
        BinarySearchTree t = new BinarySearchTree();
        Strategy s = new ReverseAlpha();
        Node c = new TreeNode("car", s);
        Node a = new TreeNode("apples", s);
        assertTrue(c.compareTo(a) < 0);
    }

    @Test
    public void testVisitor() {
        BinarySearchTree t = new BinarySearchTree();
        t.put("c");
        t.put("a");
        t.put("b");
        t.put("e");
        t.put("d");
        t.put("f");
        Visitor v = new ConcreteVisitor();
        String s = "(c(a()(b()()))(e(d()())(f()())))";
        assertTrue(v.visit(t).equals(s));
        assertTrue(t.size() == 6);
    }

    @Test
    public void testClear() {
        BinarySearchTree t = new BinarySearchTree();
        Visitor v = new ConcreteVisitor();
        t.put("c");
        t.put("a");
        t.put("b");
        t.put("e");
        t.put("d");
        t.put("f");
        assertTrue(t.size() == 6);
        t.clear();
        assertTrue(t.isEmpty());
        assertTrue(v.visit(t).equals("()"));
    }

    @Test
    public void testNullNodeComapare() {
        BinarySearchTree t = new BinarySearchTree();
        Strategy s = new ReverseAlpha();
        Node c = new TreeNode("car", s);
        Node a = new NullNode();
        assertTrue(a.isNull());

        //Tests comparing a TreeNode to a NullNode 
        boolean res = false;
        try {
            c.compareTo(a);
        } catch(Exception e) {
            res = true;
        }
        assertTrue(res);

        //Tests comparing a NullNode to a TreeNode 
        res = false;
        try {
            a.compareTo(c);
        } catch(Exception e) {
            res = true;
        }
        assertTrue(res);
    }

    //Tests Basic NullNode Operations
    @Test
    public void testNullNode() {
        BinarySearchTree t = new BinarySearchTree();
        Strategy s = new ReverseAlpha();
       
        // Tests isNull
        Node a = new NullNode();
        assertTrue(a.isNull());

        //Test Getting Child
        boolean res = false;
        try {
            a.getLeftChild();
        } catch(Exception e) {
            res = true;
        }
        assertTrue(res);

        //Tests setting Child
        res = false;
        try {
            a.setLeftChild(new TreeNode("c", s));
        } catch(Exception e) {
            res = true;
        }
        assertTrue(res);

        //Tests Put
        Node one = new TreeNode("c", s);        
        Node two = a.put(one);
        assertTrue(one.compareTo(two) == 0);
    }
}
