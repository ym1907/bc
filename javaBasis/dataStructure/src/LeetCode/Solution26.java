package LeetCode;
import java.util.Arrays;

//删除有序数组中的重复项
public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,5,5,5,6,7,8};
        int numsLength = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(numsLength);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int R = 1;R<nums.length;R++){
            if(nums[R] == nums[R-1]){
                count++;
            }else{
                nums[R+count] = nums[R];
            }
        }
        return nums.length-count;
    }
}
