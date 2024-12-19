class Solution:
    def kthmissing(self, arr, target):
        def find_first(arr, target):
            low, high = 0, len(arr) - 1
            first = -1
            while low <= high:
                mid = (low + high) // 2
                if arr[mid] == target:
                    first = mid
                    high = mid - 1
                elif arr[mid] < target:
                    low = mid + 1
                else:
                    high = mid - 1
            return first

        def find_last(arr, target):
            low, high = 0, len(arr) - 1
            last = -1
            while low <= high:
                mid = (low + high) // 2
                if arr[mid] == target:
                    last = mid
                    low = mid + 1
                elif arr[mid] < target:
                    low = mid + 1
                else:
                    high = mid - 1
            return last

        first = find_first(arr, target)
        last = find_last(arr, target)
        if first == -1 or last == -1:
            return 0
        return last - first + 1
