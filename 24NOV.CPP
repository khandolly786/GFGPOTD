class Solution {
  public:
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(vector<int> &arr) {
        int sum=0, n= arr.size(),ans=INT_MIN;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            ans=max(ans, sum);
            if(sum<0) sum=0;
        }
        return ans;
        // code here...
    }
};
