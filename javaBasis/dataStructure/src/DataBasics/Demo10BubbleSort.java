package DataBasics;

import java.util.Arrays;

//冒泡排序
/**
 * 挨个遍历对比，找出最大的放在最右边
 * 比较次数逐个减少
 */
public class Demo10BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            for(int j = 0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            return arr;
        }
        return arr;
    }
}
