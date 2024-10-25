class Solution {

  public:
    vector<int> alternateSort(vector<int>& arr) {
       sort(arr.begin(), arr.end());
        vector<int> res;
        int i = arr.size() - 1, j = 0;
        while (i >= j) {
            res.push_back(arr[i--]);
            if (i >= j) res.push_back(arr[j++]);
        }
        return res;
    }
};
