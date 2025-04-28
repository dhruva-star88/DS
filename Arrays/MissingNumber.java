package Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums, int n) {
        int sum = 0;
        int total_sum = n * (n + 1) / 2;

        for(int i=0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        int missing_num = total_sum - sum;

        return missing_num;
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int n = 6; 
        int result = missingNumber(nums, n);
        System.out.println("The missing number is: " + result);
    }
}
