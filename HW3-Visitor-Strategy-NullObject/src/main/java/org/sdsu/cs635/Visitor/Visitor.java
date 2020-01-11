package org.sdsu.cs635.Visitor;

import org.sdsu.cs635.Node.*;
import org.sdsu.cs635.Tree.BinarySearchTree;

public interface Visitor {
    public String visit(Node node);
    public String visit(TreeNode node);
    public String visit(NullNode node);
    public String visit(BinarySearchTree tree);
}
