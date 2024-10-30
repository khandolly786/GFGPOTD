class Solution:
    def countPairsWithDiffK(self, arr, k):
        count = 0
        freq = {}
        
        # Populate the frequency dictionary
        for num in arr:
            freq[num] = freq.get(num, 0) + 1
        
        # Count pairs
        for num in freq:
            if k == 0:
                # If k is 0, we are looking for pairs of identical elements
                count += (freq[num] * (freq[num] - 1)) // 2
            else:
                # Check for pairs with the required difference
                if num + k in freq:
                    count += freq[num] * freq[num + k]
        
        return count
