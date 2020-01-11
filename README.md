# Advanced-OOP-HW3
Binary Search Tree - (Grade: 100%)

Simple Binary Search Tree with Addition (no delete). 

Design Patterns Used:
1. Null Object - removes null checks in BST
2. Strategy - allows clients to provide an ordering for the BST
3. Visitor - Tree and Nodes accept a Visitor. The implemented visitor produces a string representation of the tree/nodes.

Original Assigment Instructions:

1. Implements a binary search tree with addition. You don’t have to implement delete on the tree. The
nodes in the tree contain strings.
2. Use the Null Object pattern to add a null node to your tree to eliminate the need to check for null references or pointers in your tree.
3. Modify your Binary Search Tree that uses Null object to accept a Visitor. Implement a Visitor to produce
the following representation of a search tree. Each node maps to (Value (Left Subtree)(Right Subtree)).
So the representation of the tree below is (5(3()(4()()))(10()())). 
4. Use the Strategy pattern so that clients can provide an ordering that the tree will use to order its elements. Implement two orderings. The first ordering is the normal lexicographic (or alphabetic) ordering
for strings. The second ordering compares strings by first reversing the string and then comparing the
strings lexicographically. In the second ordering "az" would come after "bb". 
