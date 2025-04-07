def selectionSort(arr):
    n = len(arr)
    for i in range(n - 1):
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
                
        # Swapping the found minimum element with the first element of the unsorted array
        temp = arr[min_index]
        arr[min_index] = arr[i]
        arr[i] = temp
        
    print("Sorted array is:")
    for i in range(n):
        print(arr[i], end=" ")
    
# Example usage
if __name__ == "__main__":
    arr = [64, 25, 12, 22, 11]
    selectionSort(arr)