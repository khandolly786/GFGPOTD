class Solution {
  public:
    int countTriplets(vector<int> &arr, int target) {
        // Code Here
        int n=arr.size();
        int cnt=0;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target)
                {
                    int left = arr[j];
                    int right = arr[k];
                    int cnt1=0;
                    int cnt2=0;
                    while(j <= k && arr[j] == left)
                    {
                        cnt1++;
                        j++;
                    }
                    while(j <= k && arr[k] == right)
                    {
                        cnt2++;
                        k--;
                    }
                    if(left == right) cnt += ( cnt1 * (cnt1 - 1))/2;
                    else cnt += (cnt1 * cnt2);
                }
                else if(sum < target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return cnt;
    }
};
