class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int res = 0;
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k)
                prefixSum += 1;
            else
                prefixSum -= 1;
            if (prefixSum > 0) {
                res = i + 1;
            }
            if (prefixMap.containsKey(prefixSum - 1)) {
                res = Math.max(res, i - prefixMap.get(prefixSum - 1));
            }
            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }
        return res;
    }
}
