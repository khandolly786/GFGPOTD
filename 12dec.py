class Solution:
    def countFreq(self, arr, target):
        def find_first_occurrence(arr, target):
            low, high = 0, len(arr) - 1
            result = -1
            while low <= high:
                mid = low + (high - low) // 2
                if arr[mid] == target:
                    result = mid
                    high = mid - 1  # Search in the left half
                elif arr[mid] < target:
                    low = mid + 1
                else:
                    high = mid - 1
            return result

        def find_last_occurrence(arr, target):
            low, high = 0, len(arr) - 1
            result = -1
            while low <= high:
                mid = low + (high - low) // 2
                if arr[mid] == target:
                    result = mid
                    low = mid + 1  # Search in the right half
                elif arr[mid] < target:
                    low = mid + 1
                else:
                    high = mid - 1
            return result

        # Finding occurrences
        first_occurrence = find_first_occurrence(arr, target)
        if first_occurrence == -1:
            return 0  # Target not found
        last_occurrence = find_last_occurrence(arr, target)
        return last_occurrence - first_occurrence + 1


# Example usage
solution = Solution()
arr = [1, 1, 2, 2, 2, 2, 3]
target = 2
print(solution.countFreq(arr, target))  # Output: 4

arr = [1, 1, 2, 2, 2, 2, 3]
target = 4
print(solution.countFreq(arr, target))  # Output: 0

arr = [8, 9, 10, 12, 12, 12]
target = 12
print(solution.countFreq(arr, target))  # Output: 3
