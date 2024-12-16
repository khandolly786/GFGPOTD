class Solution:
    def kthElement(self, a, b, k):
        m, n = len(a), len(b)
        if m > n:
            return self.kthElement(b, a, k)
        
        low, high = max(0, k - n), min(k, m)
        
        while low <= high:
            cutA = (low + high) // 2
            cutB = k - cutA
            
            leftA = a[cutA - 1] if cutA > 0 else float('-inf')
            leftB = b[cutB - 1] if cutB > 0 else float('-inf')
            rightA = a[cutA] if cutA < m else float('inf')
            rightB = b[cutB] if cutB < n else float('inf')
            
            if leftA <= rightB and leftB <= rightA:
                return max(leftA, leftB)
            elif leftA > rightB:
                high = cutA - 1
            else:
                low = cutA + 1
