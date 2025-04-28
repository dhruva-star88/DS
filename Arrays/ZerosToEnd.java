package Arrays;

public class ZerosToEnd {
    public static int[] moveZerosBruteForce(int[] arr){
        int n = arr.length;
        int[] newArray = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                newArray[j] = arr[i];
                j++;
            }
        }
        return newArray;
    }

    public static int[] moveZerosOptimal(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i = j; i < n; i ++){
            arr[i] = 0;
        }
        return arr;
    }

    public static int[] moveZerosSwap(int[] arr){
        int n = arr.length;
        int j = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if (j == -1) return arr;

        for(int i = j + 1; i < n; i++){
            if(arr[i] != 0){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 3, 12};
        int[] result = moveZerosBruteForce(arr);
        int[] resultOptimal = moveZerosOptimal(arr);
        int[] resultSwap = moveZerosSwap(arr);
        System.out.println("Brute Force Result: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println("\nOptimal Result: ");
        for (int i : resultOptimal) {
            System.out.print(i + " ");
        }
        System.out.println("\nSwap Result: ");
        for (int i : resultSwap) {
            System.out.print(i + " ");
        }

    }
}
