package Arrays;

public class ZerosToEnd {
    public static int[] moveZeros(int[] arr){
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

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = moveZeros(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
