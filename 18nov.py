class Solution:
    def rotateArr(self, arr, d):
        n = len(arr)
        d %= n
        arr[:] = arr[d:] + arr[:d]
