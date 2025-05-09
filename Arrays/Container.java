package Arrays;

public class Container {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Container container = new Container();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = container.maxArea(height);
        System.out.println("Maximum area: " + maxArea);
    }
}
