
class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        int max = 0;
        int l=0;
        int r=n-1;
        while(l<r){
            int minh = Math.min(arr[l],arr[r]);
            int area = minh*(r-l);
            max=Math.max(area,max);
            while(l<r && arr[l]<=minh){
                l++;
            }
            while(l<r && arr[r]<=minh){
                r--;
            }
        }
        return max;
    }
}
