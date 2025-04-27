package Arrays;

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
         while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                return mid;
            }

            else if (target < nums[mid]){
                high = mid - 1;
            }

            else if(target > nums[mid]){
                low = mid + 1;
            }
         }
        return low;
    }

    public static void main(String[] args) {
        InsertPosition ip = new InsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int position = ip.searchInsert(nums, target);
        System.out.println("Insert position of " + target + " is: " + position);
    }
}
