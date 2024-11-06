class Solution:
    def treePathSum(self, root):
        # Helper function to perform DFS and accumulate path sums
        def dfs(node, current_number):
            if not node:
                return 0
            
            # Update the current path number
            current_number = current_number * 10 + node.data
            
            # If it's a leaf, return the current path number
            if not node.left and not node.right:
                return current_number
            
            # Sum up the values from both subtrees
            left_sum = dfs(node.left, current_number)
            right_sum = dfs(node.right, current_number)
            
            # Return the total sum for this path
            return left_sum + right_sum

        # Start DFS from root with an initial path sum of 0
        return dfs(root, 0)
