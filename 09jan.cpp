class Solution {
  public:
    vector<int> subarraySum(vector<int> &arr, int target) {
        int n=arr.size();
        int j=0, sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            while(sum>target and j<i){
                sum-=arr[j++];
            if(sum==target){
                return{j+1, i+1};
            }
            }
            
        }
        return{-1};
        // code here
    }
};
