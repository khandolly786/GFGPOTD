def circularSubarraySum(arr):
    def kadane(arr):
        max_ending_here = max_so_far = arr[0]
        for i in range(1, len(arr)):
            max_ending_here = max(arr[i], max_ending_here + arr[i])
            max_so_far = max(max_so_far, max_ending_here)
        return max_so_far
    
    max_normal = kadane(arr)
    total_sum = sum(arr)
    min_subarray_sum = kadane([-x for x in arr])
    max_circular = total_sum + min_subarray_sum  # total_sum - (-min_subarray_sum)
    
    if max_normal < 0:
        return max_normal
    
    return max(max_normal, max_circular)
