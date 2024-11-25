class Solution:
    def maxProduct(self, arr):
        n = len(arr)

        # Initialize variables to track the max product
        max_product = arr[0]
        current_max = arr[0]
        current_min = arr[0]

        for i in range(1, n):
            # If the current element is negative, swap current_max and current_min
            if arr[i] < 0:
                current_max, current_min = current_min, current_max

            # Update current_max and current_min
            current_max = max(arr[i], current_max * arr[i])
            current_min = min(arr[i], current_min * arr[i])

            # Update max_product
            max_product = max(max_product, current_max)

        return max_product
