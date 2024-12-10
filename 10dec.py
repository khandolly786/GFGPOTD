class Solution:
    def minRemoval(self, intervals):
        intervals.sort(key=lambda x: x[1])
        non_overlapping_count = 0
        last_end = float('-inf')

        for start, end in intervals:
            if start >= last_end:
                non_overlapping_count += 1
                last_end = end

        return len(intervals) - non_overlapping_count
