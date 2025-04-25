package Arrays;

public class LargestElement {
    public static int largestElement(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    } 

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Largest element in the array is: " + largestElement(arr));
    }
}
