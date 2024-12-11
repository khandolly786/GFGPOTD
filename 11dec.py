class Solution:
    def mergeArrays(self, a, b):
        n, m = len(a), len(b)
        i, j = n - 1, 0

        while i >= 0 and j < m:
            if a[i] > b[j]:
                a[i], b[j] = b[j], a[i]
            i -= 1
            j += 1

        a.sort()
        b.sort()
        return a, b
