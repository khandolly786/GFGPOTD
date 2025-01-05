class Solution {
    public static int findMaxI(int l,int u,int[] arr,int x){
        int maxI=-1;
        while(l<=u){
            int m=l+(u-l)/2;
            if(arr[m]==x)    
                maxI=m;
            
            if(arr[m]<=x)
                l=m+1;
            else
                u=m-1;
        }
        return maxI;
    } 
    
    public static int findMinI(int l,int u,int[] arr,int x){
        int minI=-1;
        while(l<=u){
            int m=l+(u-l)/2;
            if(arr[m]==x)
                minI=m;    
            
            if(arr[m]>=x)
                u=m-1;
            else
                l=m+1;
        }
        
        return minI;
    }
    
    public static boolean isPresent(int l,int u,int[] arr,int x){
        while(l<=u){
            int m=l+(u-l)/2;
            if(arr[m]==x)
                return true;
            if(arr[m] < x)
                l=m+1;
            else
                u=m-1;
        }
        
        return false;
    }
    public int countTriplets(int[] arr, int target) {
        // Code Here
         int n=arr.length;
        int ans=0;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int remain=target-(arr[i]+arr[j]);
                if( isPresent(j+1,n-1,arr,remain) ){
                    int maxI=findMaxI(j+1,n-1,arr,remain);
                    int minI=findMinI(j+1,n-1,arr,remain);
                    
                    ans+=(maxI-minI+1);
                    
                }
                
            }
            
        }
        
        return ans;
    }
}
