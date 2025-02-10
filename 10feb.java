class Solution {
    public int sumK(Node root, int k) {
    Map<Integer, Integer>hash=new HashMap<>();
    hash.put(0,1);
    return helper(root,hash,0,k);
        // code here
    }
    int helper(Node root, Map<Integer, Integer>hash, int sum,int k){
        if(root==null)return 0;
        int ans=0;
        sum+=root.data;
        ans+=hash.getOrDefault(sum-k, 0);
        hash.put(sum, hash.getOrDefault(sum, 0)+1);
        ans+=helper(root.left,hash,sum,k);
        ans+=helper(root.right,hash,sum,k);
        hash.put(sum,hash.get(sum)-1);
        if(hash.get(sum)==0){
            hash.remove(sum);
        }
        return ans;
    }
}
