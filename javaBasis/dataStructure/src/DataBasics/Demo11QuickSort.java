package DataBasics;

import java.util.Arrays;

//快速排序
public class Demo11QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start < end){
            int sta = arr[start];
            int low = start;
            int high = end;

            while(low<high){
                while(low<high&&sta<=arr[high]){
                    high--;
                }
                arr[low] = arr[high];

                while (low<high&&sta>=arr[low]){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = sta;
            quickSort(arr,start,low);
            quickSort(arr,low+1,end);
        }
    }
}