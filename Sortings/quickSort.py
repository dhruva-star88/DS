def quickSort(arr, low, high):
    if low < high:
        partition_index = partition(arr, low, high)
        quickSort(arr, low, partition_index - 1)
        quickSort(arr, partition_index + 1, high)
        
def partition(arr, low, high):
    pivot = arr[low]
    i = low
    j = high
    
    while( i < j):
        while arr[i] <= pivot and i < high:
            i += 1
        while arr[j] > pivot and j > low:
            j -= 1
            
        if i < j:
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            
    temp = arr[low]
    arr[low] = arr[j]
    arr[j] = temp
    return j

# Example usage
if __name__ == "__main__":
    arr = [10, 7, 8, 9, 1, 5]
    n = len(arr)
    quickSort(arr, 0, n - 1)
    print("Sorted array is:", arr)