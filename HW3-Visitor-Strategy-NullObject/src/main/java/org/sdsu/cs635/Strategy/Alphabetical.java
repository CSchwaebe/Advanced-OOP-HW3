package org.sdsu.cs635.Strategy;

import org.sdsu.cs635.Node.Node;

public class Alphabetical implements Strategy {

    public Alphabetical() { }
    
	public int compare(Node n1, Node n2) {
        return n1.getValue().compareTo(n2.getValue());
    }
}