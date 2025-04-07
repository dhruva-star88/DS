package Sortings;

public class insertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j = i;
            while( j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
    }
}
