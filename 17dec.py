class Solution:
    def aggressiveCows(self, stalls, k):
        def canPlaceCows(minDist):
            count, last_pos = 1, stalls[0]
            for i in range(1, len(stalls)):
                if stalls[i] - last_pos >= minDist:
                    count += 1
                    last_pos = stalls[i]
                    if count >= k:
                        return True
            return False

        stalls.sort()
        low, high = 1, stalls[-1] - stalls[0]
        res = 0
        
        while low <= high:
            mid = (low + high) // 2
            if canPlaceCows(mid):
                res = mid
                low = mid + 1
            else:
                high = mid - 1
        return res
