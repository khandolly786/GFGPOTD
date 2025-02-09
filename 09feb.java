Maximum Path Sum from Any Node in a Binary Tree
The Maximum Path Sum from Any Node problem is a classic tree-based problem in which we need to find the maximum possible sum of a path in a binary tree. The path can start and end at any node, but it must always move downward (i.e., it cannot revisit any node once it has been used).

Problem Explanation
Given a binary tree, each node contains an integer value (which could be positive, negative, or zero).
The goal is to find the maximum sum of any path in the tree.
A path is defined as any sequence of nodes where:
Each node is connected to its parent or child.
It does not necessarily have to go through the root.
It must move only downward (cannot move back up).
Example
Input Tree:
markdown
Copy
Edit
       10
      /  \
     2   -5
    / \    
   20  1    
Possible Paths and Their Sums:
20 → 2 → 1 → Sum = 23
10 → 2 → 20 → Sum = 32
10 → -5 → Sum = 5
2 → 10 → -5 → Sum = 7
Maximum Path Sum:
✅ 32 (Path: 20 → 2 → 10)

Approach to Solve the Problem
Use a recursive DFS approach to traverse the tree.
For each node:
Compute the maximum path sum from the left and right subtrees.
Consider only positive contributions (ignore negative sums).
Update a global maximum variable to keep track of the highest path sum encountered.
Return the maximum sum path including the current node (either left or right, whichever is greater).
Time Complexity:
O(N) → Since we visit each node exactly once.
Use Cases:
✅ Dynamic Programming & Trees
✅ Used in AI & Robotics for Path Optimization
✅ Memory-efficient solutions in graph-based problems
