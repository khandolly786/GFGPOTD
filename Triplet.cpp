#include <vector>
#include <algorithm>

class Solution {
public:
    bool findTriplet(std::vector<int>& arr) {
        std::sort(arr.begin(), arr.end());
        int n = arr.size();
        for (int i = 2; i < n; i++) {
            int left = 0, right = i - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == arr[i]) return true;
                else if (sum < arr[i]) left++;
                else right--;
            }
        }
        return false;
    }
};
