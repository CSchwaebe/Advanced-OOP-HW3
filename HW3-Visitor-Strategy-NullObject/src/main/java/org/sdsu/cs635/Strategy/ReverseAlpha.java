package org.sdsu.cs635.Strategy;

import org.sdsu.cs635.Node.Node;

public class ReverseAlpha implements Strategy {

    public ReverseAlpha() {}

    public int compare(Node n1, Node n2) {
        String s1 = new StringBuilder(n1.getValue()).reverse().toString();
        String s2 = new StringBuilder(n2.getValue()).reverse().toString();
        return s1.compareTo(s2);
    }
}