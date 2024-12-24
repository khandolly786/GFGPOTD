
class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int left = 0, right = mat.length-1, row = -1;
        
        while(left <= right){
            int mid = (left + right)/2;
            
            if(mat[mid][0] == x) return true;
            if(mat[mid][0] < x){
                row = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        
        if(row == -1) return false;
        
        left = left-1;
        int nleft = 0, nright = mat[0].length-1;
        while(nleft <= nright){
            int mid = (nleft + nright)/2;
            
            if(mat[row][mid] == x) return true;
            if(mat[row][mid] < x){
                nleft = mid+1;
                
            }else{
                nright = mid-1;
            }
        }
        
        return false;
    }
}
