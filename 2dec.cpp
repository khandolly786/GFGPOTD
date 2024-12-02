class Solution {
public:
    // Function to compute the LPS array
    void computeLPS(string &pat, int m, vector<int> &LPS) {
        LPS[0] = 0; // LPS[0] is always 0
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < m) {
            if (pat[i] == pat[length]) {
                length++;
                LPS[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = LPS[length - 1];
                } else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }
    }

    // KMP Search function
    vector<int> search(string &pat, string &txt) {
        int m = pat.size();
        int n = txt.size();

        vector<int> LPS(m, 0);
        vector<int> result;

        // Compute the LPS array
        computeLPS(pat, m, LPS);

        int i = 0; // Index for txt[]
        int j = 0; // Index for pat[]

        while (i < n) {
            if (txt[i] == pat[j]) {
                i++;
                j++;
            }

            if (j == m) { // Match found
                result.push_back(i - j); // Append the starting index
                j = LPS[j - 1];
            } else if (i < n && pat[j] != txt[i]) {
                if (j != 0) {
                    j = LPS[j - 1];
                } else {
                    i++;
                }
            }
        }

        return result;
    }
};
