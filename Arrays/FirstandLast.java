package Arrays;

public class FirstandLast {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums, target);
        int right = findRight(nums, target);

        if(left <= right && left >= 0 && right < nums.length && nums[left] == target && nums[right] == target){
            return new int[]{left, right};
        }
        return new int[]{-1, -1};

    }
    private int findLeft(int[] nums, int target){
            int left = 0;
            int right = nums.length - 1;
            int result = nums.length;

            while(left <= right){
                int mid = (left + right) / 2;
                if(target <= nums[mid] ){
                    right = mid - 1;
                    result = mid;
                }
                else{
                    left = mid + 1;
                }
            }
             return result;
        }

         private int findRight(int[] nums, int target){
            int left = 0;
            int right = nums.length - 1;
            int result = -1;

            while(left <= right){
                int mid = (left + right) / 2;

                if(target >= nums[mid]){
                    left = mid + 1;
                    result = mid;
                }
                else{
                    right = mid - 1;
                }
            }
            return result;
        }

    public static void main(String[] args) {
        FirstandLast fl = new FirstandLast();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = fl.searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }
}
