package LeetCode;

//输入：nums = [1,2,3,4]
//输出：[1,3,6,10]
//解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。

public class Solution1480 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = runningSum(a);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        String str = makeGood("AaGgYyUuOboBrNRn");
        System.out.println("\"" + str + "\"");

    }
    public static int[] runningSum(int[] nums) {
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                b[i] = nums[i];
            }else{
                b[i] = b[i - 1] + nums[i];
            }
        }
        return b;
    }
    public static String makeGood(String s) {
        StringBuffer sb = new StringBuffer(s);
        for(int i = 0; i <= sb.length() - 2;){
            if( Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 32 ){
                sb.delete(i, i + 2);
                i = 0;
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
