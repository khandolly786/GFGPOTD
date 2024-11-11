class Solution:
    def minIncrements(self, arr):
        arr.sort()
        increments = 0
        for i in range(1, len(arr)):
            if arr[i] <= arr[i - 1]:  # If the current element is not unique
                new_val = arr[i - 1] + 1
                increments += new_val - arr[i]  # Increment it to be unique
                arr[i] = new_val  # Update the array with the new unique value
        return increments
