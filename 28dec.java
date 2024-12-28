import java.util.*;

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Iterate over the array
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements for the first element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    // Add the triplet to the result
                    result.add(Arrays.asList(i, left, right));

                    // Move pointers and avoid duplicates
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, -1, 2, -3, 1};
        List<List<Integer>> triplets = solution.findTriplets(arr);

        System.out.println("Triplets:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
