import heapq

class Solution:
    def nearlySorted(self, arr, k):
        # Initialize a min-heap with the first k+1 elements
        min_heap = arr[:k + 1]
        heapq.heapify(min_heap)
        
        index = 0  # To track the index in the sorted part of the array
        
        # Process the elements from k+1 to the end of the array
        for i in range(k + 1, len(arr)):
            # Extract the minimum element and place it in the sorted part
            arr[index] = heapq.heappop(min_heap)
            index += 1
            # Push the current element into the heap
            heapq.heappush(min_heap, arr[i])
        
        # Extract all remaining elements from the heap and place them in sorted order
        while min_heap:
            arr[index] = heapq.heappop(min_heap)
            index += 1

        return arr
