def LongestSubArray(arr, total):
    n = len(arr)
    maxlen = 0
    for i in range(0, n ):
        for j in range(0, n):
            sum = 0
            for k in range(i, j + 1):
                sum += arr[k]
            
            if sum == total:
                maxlen = max(maxlen, j - i + 1)
                
    return maxlen

# Example usage:
arr = [1, 2, 3, 4, 5]
total = 9
result = LongestSubArray(arr, total)
print(f"The length of the longest subarray with sum {total} is: {result}")
