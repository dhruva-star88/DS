package Hashing;

public class Hashing {
    public static int[] hashing(int[] nums){
        int n = nums.length;
        int[] hash = new int[13];

        for(int i = 0; i < n; i++){
            hash[nums[i]] += 1; 
        }

        return hash;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3};
        int[] result = hashing(nums);
        System.out.print("Hashing result: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
