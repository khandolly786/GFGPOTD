class Solution {
  public:
    vector<int> spirallyTraverse(vector<vector<int> > &mat) {
        // code here
        vector<int>matrix;
        int n=mat.size();
        int m=mat[0].size();
        
        if(mat.empty()) {
            return matrix;
        }
        
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        int dir=0;
        
        while(top<=bottom && left<=right){
            
            if(dir==0){
             for(int j=top;j<=right;j++) {matrix.push_back(mat[top][j]); } 
             top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++){ matrix.push_back(mat[i][right]);  }   
                right-- ;
            }
            else if(dir==2){
                for(int j=right;j>=left;j--){ matrix.push_back(mat[bottom][j]);  } 
                bottom--;
            }else{
              for(int i=bottom;i>=top;i--){ matrix.push_back(mat[i][left]);  }   
              left++;
            }
            
            dir=(dir+1)%4;
            
        }
        
        return matrix;
        
    }
};
