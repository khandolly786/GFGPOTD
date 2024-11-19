#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void nextPermutation(vector<int>& arr) {
        int n = arr.size();
        int i = n - 2;

        // Step 1: Find the first decreasing element
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the element just larger than arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap arr[i] and arr[j]
            swap(arr[i], arr[j]);
        }

        // Step 4: Reverse the elements from i+1 to the end
        reverse(arr.begin() + i + 1, arr.end());
    }
};

int main() {
    vector<int> arr = {2, 4, 1, 7, 5, 0};
    Solution sol;
    sol.nextPermutation(arr);

    for (int num : arr) {
        cout << num << " ";
    }
    return 0;
}
