package Arrays;

public class MaximumConsecutive {
    public static int maximumConsecutive(int[] nums){
        int maxCount = 0;
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            // if(count > maxCount){
            //     maxCount = count;
            // }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int result = maximumConsecutive(nums);
        System.out.println("Maximum Consecutive Ones: " + result);
    }
}
