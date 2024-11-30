from collections import Counter

class Solution:
    def areAnagrams(self, s1, s2):
        # If lengths differ, they cannot be anagrams
        if len(s1) != len(s2):
            return False
        
        # Use Counter to count character frequencies
        freq_s1 = Counter(s1)
        freq_s2 = Counter(s2)
        
        # Compare the frequency dictionaries
        return freq_s1 == freq_s2
