#include <iostream>
#include <unordered_set>
#include <vector>
using namespace std;

class Solution {
  public:
    vector<int> removeDuplicate(vector<int>& arr) {
        unordered_set<int> seen;
        vector<int> uniqueElements;

        // Loop through each element in the array
        for (int num : arr) {
            // If the element has not been seen, add it to the result and mark it as seen
            if (seen.find(num) == seen.end()) {
                uniqueElements.push_back(num);
                seen.insert(num);
            }
        }

        return uniqueElements;
    }
};

int main() {
    Solution sol;
    vector<int> arr = {2, 2, 3, 3, 7, 5};
    vector<int> result = sol.removeDuplicate(arr);

    // Print unique elements
    cout << "Unique elements: ";
    for (int num : result) {
        cout << num << " ";
    }

    return 0;
}
