package DataBasics;

//斐波那契数列：1、1、2、3、5、8、13、21、34、55...
public class Demo08Fibonacci {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        int i = fibonacci(50);
        System.out.println("斐波那契数列第八位是：" + i);
        long t2 = System.currentTimeMillis();
        System.out.println("耗时：" + (t2-t1) + "毫秒");
    }
    public static int fibonacci(int i){
        if(i == 1 || i == 2){
            return 1;
        }else{
            return fibonacci(i - 1) + fibonacci(i - 2 );
        }
    }
}
