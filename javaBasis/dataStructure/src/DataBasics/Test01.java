package DataBasics;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        int[] nums = {3,4,5,6,7,8,9,10,11,12,13,14,15};
        int numToFind = 11;

        int lowIndex = 0;
        int highIndex = nums.length - 1;

        boolean isFound = false;
        while(lowIndex <= highIndex) {
//            Thread.sleep(5000);
            int middle = (lowIndex + highIndex)/2;				//中间位置
            if(numToFind == nums[middle]) {
                System.out.println(numToFind + "元素对应的索引位置为：" + middle);
                isFound = true;
                break;
            }else {
                if(numToFind < nums[middle]){
                    highIndex = middle - 1;
                    System.out.println("highIndex：" + highIndex);
                    System.out.println("lowIndex：" + lowIndex);
                }else {
                    lowIndex = middle + 1;
                    System.out.println("highIndex：" + highIndex);
                    System.out.println("lowIndex：" + lowIndex);
                }
            }
            System.out.println("-----------------------------------");

        }
        if(!isFound) {			//!isFound 等同于 isFound == false;
            System.out.println("没有找到元素：" + numToFind);
        }

    }
}
