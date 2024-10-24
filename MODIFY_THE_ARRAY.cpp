class Solution {
public:
    vector<int> modifyAndRearrangeArray(vector<int> &arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; ++i) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }
        
        vector<int> result;
        for (int i = 0; i < n; ++i) {
            if (arr[i] != 0) {
                result.push_back(arr[i]);
            }
        }
        
        while (result.size() < n) {
            result.push_back(0);
        }
        
        return result;
    }
};
