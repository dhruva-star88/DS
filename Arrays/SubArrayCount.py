def count_subarrays_with_sum_k(nums, k):
    prefix_map = {0: 1}  # prefix_sum -> count of occurrences
    curr_sum = 0
    count = 0

    for num in nums:
        curr_sum += num

        # If (curr_sum - k) seen before, add its count to result
        if (curr_sum - k) in prefix_map:
            count += prefix_map[curr_sum - k]

        # Record current prefix sum occurrences
        prefix_map[curr_sum] = prefix_map.get(curr_sum, 0) + 1

    return count

# Example:
nums = [1, 1, 1]
k = 2
print("Number of subarrays with sum", k, ":", count_subarrays_with_sum_k(nums, k))
# Output: 2
