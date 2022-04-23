package LeetCode;

public class Solution11 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,7,8,7,4};

        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        if(height.length<2) {
            return 0;
        }

        int left = 0;
        int right = height.length-1;
        // ans 为结果 min为两个木板的长度最小值
        int ans = 0; int min = 0;
        while(left<right){
            min = Math.min(height[left],height[right]);
            ans = Math.max(ans,(right-left)*min);
            // 如果左边短 就右移
            if(height[left]<height[right]){
                left++;
            }else{
                // 右边短就左移
                right --;
            }
        }
        return ans;
    }
}
