class Solution {
  public:
    long long maxSum(vector<int>& arr) {
        sort(arr.begin(), arr.end());
        int i =0; int n = arr.size(); int j = n-1;
        int sum =0;
        while(i<j){
            sum += arr[j]-arr[i];
            sum += arr[j]- arr[i+1];
            i++;
            j--;
        }
        sum += arr[n/2]-arr[0];
        return sum;
    }
};
