package Arrays;

public class LeftRotated {

    // Brute Force Approach
    public static void LeftRotatedBruteForce(int[] arr){
        int n = arr. length;
        int[] temp = new int[n]; 
        for(int i = 1; i < n; i++){
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        for(int i = 0; i < n; i ++){
            System.out.print(temp[i] + " ");
        }
    }

    // Optimal Approach
    public static void LeftRotatedOptimal(int[] arr){
        int n = arr.length;
        int x = arr[0];

        for(int i = 0; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = x;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LeftRotatedBruteForce(arr);
        System.out.println();
        LeftRotatedOptimal(arr);
    }
}
