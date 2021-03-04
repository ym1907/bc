package DataBasics;

import java.util.Arrays;

public class Demo02Stack {
    private int[] elements;

    public Demo02Stack(){
        elements = new int[0];
    }

    //压入元素
    public void push(int element){
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    //取出栈顶元素
    public int pop(){
        if(elements.length == 0){
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length - 1];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    //查看栈顶元素
    public int peek(){
        if(elements.length == 0){
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    //判断是否为空
    public boolean isEmpty(){
        return elements.length == 0;
    }

    //打印栈中元素
    public void show(){
        System.out.println(Arrays.toString(elements));
    }

}
