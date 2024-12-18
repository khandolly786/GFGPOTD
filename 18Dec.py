class Solution:
    def findPages(self, arr, k):
        def isPossible(arr, k, max_pages):
            students = 1
            current_pages = 0
            for pages in arr:
                if current_pages + pages > max_pages:
                    students += 1
                    current_pages = pages
                    if students > k:
                        return False
                else:
                    current_pages += pages
            return True

        if len(arr) < k:
            return -1

        low, high = max(arr), sum(arr)
        result = -1
        while low <= high:
            mid = (low + high) // 2
            if isPossible(arr, k, mid):
                result = mid
                high = mid - 1
            else:
                low = mid + 1
        return result
