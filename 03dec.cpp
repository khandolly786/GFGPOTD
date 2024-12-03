#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

class Solution {
public:
    int minChar(string& s) {
        int n = s.size();
        string reversedS = s;
        reverse(reversedS.begin(), reversedS.end());
        
        string temp = s + '#' + reversedS;
        int m = temp.size();
        
        vector<int> lps(m, 0);
        computeLPS(temp, lps);
        
        return n - lps[m - 1];
    }

private:
    void computeLPS(string& str, vector<int>& lps) {
        int n = str.size();
        int len = 0;
        int i = 1;
        lps[0] = 0;
        
        while (i < n) {
            if (str[i] == str[len]) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
};
