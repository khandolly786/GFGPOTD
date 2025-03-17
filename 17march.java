class Solution {
  public:
    bool isSubsetSum(vector<int>& arr, int sum) {
        vector<bool> dp(sum+1, false);
        dp[0]=true;
        for(int i:arr){
            for(int j= sum-i; j>=0; j--){
                dp[i+j]=dp[i+j]|dp[j];
            }
        }
        return dp[sum];
    }
};
