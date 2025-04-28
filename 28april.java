class Solution {
    // Function to return the maximum sum of non-adjacent nodes.
    public int getMaxSum(Node root) {
        // code here
        Map<Node,Integer> mapObj = new HashMap<>();
        return getMaxSumUtility(root,mapObj);
    }
    
    int getMaxSumUtility(Node root, Map<Node,Integer> mapObj) {
        if(root == null) {
            return 0;
        }
        if(mapObj.containsKey(root)) {
            return mapObj.get(root);
        }
        int currData = root.data;
        if(root.left != null) {
            currData += getMaxSumUtility(root.left.left,mapObj);
            currData += getMaxSumUtility(root.left.right,mapObj);
        }
        if(root.right != null) {
            currData += getMaxSumUtility(root.right.left,mapObj);
            currData += getMaxSumUtility(root.right.right,mapObj);
        }
        int parentData = getMaxSumUtility(root.left,mapObj);
        parentData += getMaxSumUtility(root.right,mapObj);
        mapObj.put(root,Math.max(currData,parentData));
        return mapObj.get(root);
    }
}
