import java.util.HashMap;

class Solution {
    public int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;

        for (int num : arr) {
            int comp = target - num; // Calculate the complement

            // Check if the complement exists in the map
            if (freq.containsKey(comp)) {
                cnt += freq.get(comp); // Add the frequency of the complement to count
            }

            // Update the frequency of the current number
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return cnt; // Return the total count of pairs
    }
}
