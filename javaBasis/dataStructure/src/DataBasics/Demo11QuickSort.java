package DataBasics;

import java.util.Arrays;
import java.util.Random;

//快速排序
public class Demo11QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,18,7,16,5,14,3,12,1};

        //方法一
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        //方法二
//        quickSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start < end){    //{9,18,7,16,5,14,3,12,1};
            int begin = arr[start];
            int low = start;
            int high = end;

            while(low<high){
                while(low<high && begin<=arr[high]){
                    high--;
                }
                arr[low] = arr[high];

                while (low<high && begin>=arr[low]){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = begin;
            quickSort(arr,start,low-1);
            quickSort(arr,low+1,end);
        }
    }

//    public static void quickSort(int[] arr) {
//        if (arr == null || arr.length < 2) {
//            return;
//        }
//        quickSort(arr, 0, arr.length - 1);
//    }
//
//    /**
//     * 快速排序，使得整数数组 arr 的 [L, R] 部分有序
//     */
//    public static void quickSort(int[] arr, int L, int R) {
//        if(L < R) {
//            int[] p = partition(arr, L, R);
//            quickSort(arr, L, p[0] - 1);
//            quickSort(arr, p[1] + 1, R);
//        }
//    }
//
//    /**
//     * 分区的过程，整数数组 arr 的[L, R]部分上，使得：
//     *   大于 arr[R] 的元素位于[L, R]部分的右边，但这部分数据不一定有序
//     *   小于 arr[R] 的元素位于[L, R]部分的左边，但这部分数据不一定有序
//     *   等于 arr[R] 的元素位于[L, R]部分的中间
//     * 返回等于部分的第一个元素的下标和最后一个下标组成的整数数组
//     */
//    public static int[] partition(int[] arr, int L, int R) {
//        int basic = arr[R];
//        int less = L - 1;
//        int more = R + 1;
//        while(L < more) {
//            if(arr[L] < basic) {
//                swap(arr, ++less, L++);
//            } else if (arr[L] > basic) {
//                swap(arr, --more, L);
//            } else {
//                L++;
//            }
//        }
//        return new int[] { less + 1, more - 1 };
//    }
//
//    /*
//     * 交换数组 arr 中下标为 i 和下标为 j 位置的元素
//     */
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
