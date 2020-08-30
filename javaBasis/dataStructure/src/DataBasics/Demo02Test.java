package DataBasics;

import java.util.Arrays;

public class Demo02Test {
    public static void main(String[] args) {
        Demo02Stack stack = new Demo02Stack();
//        int pop = stack.pop();
//        System.out.println(pop);

        System.out.println("是否为空：" + stack.isEmpty());

        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.peek());

    }
}
