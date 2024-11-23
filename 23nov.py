class Solution:
    def getMinDiff(self, arr, k):
        n = len(arr)
        arr.sort()
        result = arr[-1] - arr[0]
        for i in range(n - 1):
            max_height = max(arr[-1] - k, arr[i] + k)
            min_height = min(arr[0] + k, arr[i + 1] - k)
            if min_height < 0:
                continue
            result = min(result, max_height - min_height)
        return result
