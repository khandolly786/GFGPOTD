class Solution:
    def mergeOverlap(self, arr):
        arr.sort(key=lambda x: x[0])
        result = []
        for interval in arr:
            if not result or result[-1][1] < interval[0]:
                result.append(interval)
            else:
                result[-1][1] = max(result[-1][1], interval[1])
        return result
