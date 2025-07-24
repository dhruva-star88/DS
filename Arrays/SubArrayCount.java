package Arrays;

import java.util.HashMap;

public class SubArrayCount {
    public static int subArrayCount(int[] nums, int target) {
    int n = nums.length;
    int c = 0;
    for (int i = 0; i < n; i++) {
        int sum = 0;  // Initialize sum for this start index
        for (int j = i; j < n; j++) {
            sum += nums[j];  // Add current element to sum
            if (sum == target) {
                c++;
            }
        }
    }
    return c;
}
public static int subArrayCountOptimal(int[] nums, int target) {
    int n = nums.length;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for(int i = 0; i < n; i++){
        int c_sum = 0;
        c_sum = c_sum + nums[i];
        if(map.containsKey(c_sum - target)){
            count += map.get(c_sum - target);
        }
        map.put(c_sum, map.getOrDefault(c_sum, 0) + 1);

    }
    return count;
}

    public static void main(String[] args) {
    int[] nums = {1, 2, 3, -3, 1, 1 , 1, 4, 2, -3};
    int target = 3;
    int count = subArrayCount(nums, target);
    System.out.println("Number of subarrays with sum " + target + ": " + count);
}
}


