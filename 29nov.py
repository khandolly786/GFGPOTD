class Solution:
    def addBinary(self, s1, s2):
        # Initialize pointers for the binary strings
        i, j = len(s1) - 1, len(s2) - 1
        carry = 0
        result = []

        # Traverse both strings from right to left
        while i >= 0 or j >= 0 or carry:
            bit1 = int(s1[i]) if i >= 0 else 0
            bit2 = int(s2[j]) if j >= 0 else 0

            # Calculate sum of bits and carry
            total = bit1 + bit2 + carry
            result.append(str(total % 2))  # Append the binary result
            carry = total // 2  # Update carry

            # Move pointers
            i -= 1
            j -= 1

        # Reverse the result and join to form the binary string
        return ''.join(result[::-1])
