def countDistinctElements(arr, k):
    from collections import defaultdict
    
    freq_map = defaultdict(int)  # Dictionary to store element frequencies
    result = []  # List to store the count of distinct elements in each window
    
    # Initialize the first window
    for i in range(k):
        freq_map[arr[i]] += 1
    result.append(len(freq_map))
    
    # Slide the window
    for i in range(k, len(arr)):
        # Remove the leftmost element of the previous window
        freq_map[arr[i - k]] -= 1
        if freq_map[arr[i - k]] == 0:
            del freq_map[arr[i - k]]
        
        # Add the new element
        freq_map[arr[i]] += 1
        
        # Append the count of distinct elements in the current window
        result.append(len(freq_map))
    
    return result
