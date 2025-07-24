def twosum(arr, target):
    n = len(arr)
    for i in range(n):
        for j in range(i + 1, n):
            if arr[i] + arr[j] == target:
                return (i, j)
    
    
# Example usage
arr = [2, 7, 11, 15]
target = 9
result = twosum(arr, target)
print(f"Indices of the two numbers that add up to {target} are: {result}")
    