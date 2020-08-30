package DataBasics;

public class Demo03Test {
    public static void main(String[] args) {
        Demo03Queue queue = new Demo03Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.poll());
        //中途加元素，依然先进先出
        queue.add(15);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
    }
}
