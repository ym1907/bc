package DataBasics;
import java.util.Arrays;

//插入排序
/**
 * 从左向右挨个遍历
 * 第后一个与前一个进行比较，小于则互换位置
 * 遍历次数逐次增加
 *
 * */
public class Demo12InsertSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
        //遍历所有的数字
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                int temp = arr[i];
                int j;
                for(j = i-1;j>=0 && arr[j]>temp;j--){ //后一个比前一个大时结束循环 （1，3，4，2）
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }
}
