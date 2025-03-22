class Solution {
    int maxValue(int[] arr) {
        int n=arr.length;
        if(n==1)return arr[0];
        if(n==2) return Math.max(arr[0], arr[1]);
        return Math.max(robLinear(arr, 0,n-2), robLinear(arr,1,n-1));
    }
    private int robLinear(int []nums, int start, int end){
        int prev1=0, prev2=0;
        for(int i=start; i<=end; i++){
            int curr=Math.max(prev1, nums[i]+prev2);
            prev2=prev1;
            prev1=curr;
            
        }
        return prev1;
    }
        
        
    }
