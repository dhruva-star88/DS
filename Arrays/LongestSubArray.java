package Arrays;

public class LongestSubArray {
    public static int longestSubArray(int[] nums, int total){
        int n = nums.length;
        int maxlen = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                long sum = 0;
                for(int k = i; k <= j; k++){
                    sum += nums[k];
                }
                if(sum == total){
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int total = 5;
        int result = longestSubArray(nums, total);
        System.out.println("Longest Subarray with sum " + total + ": " + result);
    }
}
