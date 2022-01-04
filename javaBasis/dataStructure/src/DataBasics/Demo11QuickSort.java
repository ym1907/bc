package DataBasics;

import java.util.Arrays;

//递归排序
public class Demo11QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,18,7,16,5,14,3,12,1};

        //方法一
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int L,int R){
        if(L < R){    //{9,18,7,16,5,14,3,12,1};
            int standard = arr[L];
            int low = L;
            int high = R;

            while(low<high){
                while(low<high && standard<=arr[high]){
                    high--;
                }
                arr[low] = arr[high];

                while (low<high && standard>=arr[low]){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = standard;

            quickSort(arr,L,low-1);
            quickSort(arr,low+1,R);
        }
    }
}
