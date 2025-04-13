package Sortings;

public class quickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(arr[i] <= pivot && i < high){
                i++;
            }
            while(arr[j] > pivot && j > low){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before sorting: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nAfter sorting: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
