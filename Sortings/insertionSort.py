def insertionSort(arr):
    n = len(arr)
    for i in range(0, n):
        j = i
        while j > 0 and arr[j - 1] > arr[j]:
            temp = arr[j - 1]
            arr[j - 1] = arr[j]
            arr[j] = temp
            j= j - 1
            
    return arr

# Example usage
if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6]
    print("Unsorted array:", arr)
    sorted_arr = insertionSort(arr)
    print("Sorted array:", sorted_arr)