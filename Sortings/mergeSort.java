package Sortings;

import java.util.ArrayList;

public class mergeSort {

    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        else{
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        //int [] temp;
        int left = low;
        int right = mid + 1;

        // Storing the elements in the sorted manner in temp array
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        // If there are any elements left in the left half, add them to temp
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        // If there are any elements left in the right half, add them to temp
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        // Copying the elements from temp to arr
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before sorting: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("After sorting: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
