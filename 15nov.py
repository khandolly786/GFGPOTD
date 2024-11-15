class Solution:
    def getSecondLargest(self, arr):
        # Step 1: Find the largest element
        largest = -1
        second_largest = -1
        
        for num in arr:
            if num > largest:
                largest = num
        
        # Step 2: Find the second largest element
        for num in arr:
            if num > second_largest and num < largest:
                second_largest = num
        
        return second_largest if second_largest != -1 else -1
