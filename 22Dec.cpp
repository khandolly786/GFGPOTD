class Solution {
  public:
    bool matSearch(vector<vector<int>> &mat, int X) {
        // your code here
        int N = mat.size();
        int M = mat[0].size();
        for(int i=0;i<N;i++){
            int s = 0;
            int e = M-1;
            int mid = s + (e-s)/2;
            while(s<=e){
                int el = mat[i][mid];
                if(el==X){
                    return 1;
                }
                if(el>X){
                    e = mid-1;
                }
                else{
                    s=mid+1;
                }
                mid = s + (e-s)/2;
            }
        }
        return 0;
    }
};
