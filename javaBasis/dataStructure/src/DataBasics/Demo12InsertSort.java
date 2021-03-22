package DataBasics;
import java.util.Arrays;

//插入排序
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
                for(j = i-1;j>=0 && arr[j]>temp;j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }
}
