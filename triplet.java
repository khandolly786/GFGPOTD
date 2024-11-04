import java.util.*;

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        int n = arr.length;

        // Sort the array to enable the two-pointer approach
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    // Store the original indices of the triplet
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(findIndex(arr, arr[i], i));
                    triplet.add(findIndex(arr, arr[left], left));
                    triplet.add(findIndex(arr, arr[right], right));
                    Collections.sort(triplet); // Ensure indices are sorted
                    triplets.add(triplet);

                    // Move left and right pointers and skip duplicates
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;
    }

    private int findIndex(int[] arr, int value, int skipIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value && i != skipIndex) {
                return i;
            }
        }
        return -1; // This case should not happen given the problem constraints
    }
}
