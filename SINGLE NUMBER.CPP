class Solution {
  public:
    int getSingle(vector<int>& arr) {
        int result = 0;
    for (int num : arr) {
        result ^= num; // XOR all the elements
    }
    return result;
    }
};
