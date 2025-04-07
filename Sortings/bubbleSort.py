def bubbleSort(arr):
    n =  len(arr)
    for i in range(0, n - 1):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                # swapping the elements
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                
    return arr

# Example usage
if __name__ == "__main__":
    arr = [64, 34, 25, 12, 22, 11, 90]
    print("Unsorted array:", arr)
    sorted_arr = bubbleSort(arr)
    print("Sorted array:", sorted_arr)