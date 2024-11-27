#include <iostream>
#include <vector>
#include <unordered_map>
#include <climits> // For INT_MAX and INT_MIN
using namespace std;

pair<int, int> findHighestLowestFrequencyElements(vector<int>& v) {
    unordered_map<int, int> freqMap;

    // Step 1: Count the frequency of each element
    for (int num : v) {
        freqMap[num]++;
    }

    // Step 2: Find the element with the highest and lowest frequency
    int highestFreq = INT_MIN, lowestFreq = INT_MAX;
    int highestElem = INT_MAX, lowestElem = INT_MAX;

    for (auto& entry : freqMap) {
        int element = entry.first;
        int frequency = entry.second;

        // Check for highest frequency
        if (frequency > highestFreq || (frequency == highestFreq && element < highestElem)) {
            highestFreq = frequency;
            highestElem = element;
        }

        // Check for lowest frequency
        if (frequency < lowestFreq || (frequency == lowestFreq && element < lowestElem)) {
            lowestFreq = frequency;
            lowestElem = element;
        }
    }

    return {highestElem, lowestElem};
}

int main() {
    vector<int> v1 = {1, 2, 3, 1, 1, 4};
    vector<int> v2 = {10, 10, 10, 3, 3, 3};

    auto result1 = findHighestLowestFrequencyElements(v1);
    auto result2 = findHighestLowestFrequencyElements(v2);

    cout << result1.first << " " << result1.second << endl; // Output: 1 2
    cout << result2.first << " " << result2.second << endl; // Output: 3 3

    return 0;
}
