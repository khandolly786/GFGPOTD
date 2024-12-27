
class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
           if (arr == null || arr.length < 2) {
            return 0; // Handle edge cases: null or array with less than 2 elements
        }

        Map<Integer, Integer> numCounts = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;
            if (numCounts.containsKey(complement)) {
                count += numCounts.get(complement); // Add the count of complements
            }
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1); // Increment count of current number
        }

        return count;

    }
}
