class Solution {
public:
    bool matSearch(vector<vector<int>> &mat, int x) {
        // Validate the matrix to ensure it's non-empty
        if (mat.empty() || mat[0].empty()) return false;

        int n = mat.size();          // Number of rows
        int m = mat[0].size();       // Number of columns

        int i = 0, j = m - 1;        // Start at the top-right corner

        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                return true;         // Found the target
            } else if (mat[i][j] < x) {
                i++;                 // Move down if the target is greater
            } else {
                j--;                 // Move left if the target is smaller
            }
        }

        return false;                // Target not found
    }
};
