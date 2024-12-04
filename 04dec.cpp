class Solution {
  public:
    // Function to check if two strings are rotations of each other or not.
    bool areRotations(string &s1, string &s2) {
        string str= s2+'$'+s1+s1;
        int n= str.size();
        int m= s2.size();
        vector<int> lps(n,0);
        int i=0, j=1;
        while(j<n){
            if(str[i]==str[j]){
                lps[j++]=++i;
                if(i==m) return true;
            }else if(i) i=lps[i-1];
            else j++;
        }
        return false;
    }
};
