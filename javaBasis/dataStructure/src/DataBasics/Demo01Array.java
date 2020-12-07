package DataBasics;

import java.util.Arrays;

public class Demo01Array {
    private int[] arr;

    //创建新数组
    public Demo01Array(){
        arr = new int[0];
    }

    //打印输出数组
    public void show(){
        System.out.println(Arrays.toString(arr));
    }

    //返回数组长度
    public int size(){
        return arr.length;
    }

    //添加元素
    public void add(int element){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        arr = newArr;
    }

    //删除元素
    public void delete(int index){
        if(index < 0 && index > arr.length-1){
            throw new RuntimeException("下表越界异常");
        }
        int[] newArr = new int[arr.length - 1];
//        for(int i = 0; i < arr.length; i++){
//            if(i < index){
//                newArr[i] = arr[i];
//            }else if(i > index){
//                newArr[i-1] = arr[i];
//            }
//        }
        //少遍历一次，提高效率
        for(int i = 0; i < newArr.length; i++){
            if(i < index){
                newArr[i] = arr[i];
            }else{
                //复制目标删除数组后面的数据
                newArr[i] = arr[i + 1];
            }
        }
        arr = newArr;
    }

    //取出指定位置的元素
    public Object get(int index){
        return arr[index];
    }

    //插入指定元素到指定位置
    public void insert(int index, int element){
        if(index < 0 && index > arr.length-1){
            throw new RuntimeException("下表越界异常");
        }
        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            if(i < index){
                newArr[i] = arr[i];
            }else{
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = element;
        arr = newArr;
    }

    //替换指定位置元素
    public void set(int index, int element){
        if(index < 0 && index > arr.length-1){
            throw new RuntimeException("下表越界异常");
        }
        arr[index] = element;
    }

    //线性查找
    public int selectIndex(int element){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return index;
    }

    //二分法查找
    public int binarySearch(int element){
        int begin = 0;
        int end = arr.length - 1;
        int mid = (end + begin)/2;
        int index = -1;
        while (begin <= end){
            if(element == arr[mid]){
                return mid;
            }else{
                if(element < arr[mid]){
                    end = mid - 1;
                }else{
                    begin = mid + 1;
                }
                mid = (end + begin)/2;
            }
        }
        return index;
    }

}
