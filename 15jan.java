
class Solution {
  public:
    int longestSubarray(vector<int>& arr, int k) {
        // code here
        unordered_map<long long,int>mp;
        long long sum=0;
        int n=arr.size();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                ans=max(ans,i+1);
            }
            long long req=sum-k;
            if(mp.find(req)!=mp.end())
            {
                ans=max(ans,i-mp[req]);
            }
            if(mp.find(sum)==mp.end())
            {
                mp[sum]=i;
            }
        }
        return ans;
    }
};
