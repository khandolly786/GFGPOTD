class Solution:
    def myAtoi(self, s: str) -> int:
        # Constants for INT32 range
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        # Step 1: Remove leading whitespaces
        s = s.lstrip()
        if not s:  # If string is empty after trimming
            return 0
        
        # Step 2: Handle sign
        sign = 1
        if s[0] == '-':
            sign = -1
            s = s[1:]  # Remove the sign character
        elif s[0] == '+':
            s = s[1:]  # Remove the sign character
        
        # Step 3: Extract digits
        result = 0
        for char in s:
            if char.isdigit():
                result = result * 10 + int(char)
                # Step 4: Handle overflow
                if result * sign > INT_MAX:
                    return INT_MAX
                elif result * sign < INT_MIN:
                    return INT_MIN
            else:
                break  # Stop processing on encountering a non-digit character
        
        # Step 5: Return the final result with the correct sign
        return result * sign
