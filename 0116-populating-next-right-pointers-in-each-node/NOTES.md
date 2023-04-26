no null to specifically assign a pointer to null if the node is not present
- left of root will be equal to right of root
- if the next of root is not null then assign root.right to root.next.left
- keep on doing the same operation on left and right side of the tree
- in the end return the root
- the base condition will be when root == null or root.left == null || root.right == null
- return root as we are working for children