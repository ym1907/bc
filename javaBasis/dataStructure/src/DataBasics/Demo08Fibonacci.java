package DataBasics;

//斐波那契数列：1、1、2、3、5、8、13、21、34、55...
public class Demo08Fibonacci {
    public static void main(String[] args) {
        int i = fibonacci(8);
        System.out.println("斐波那契数列第八位是：" + i);
    }
    public static int fibonacci(int i){
        if(i == 1 || i == 2){
            return 1;
        }else{
            return fibonacci(i - 1) + fibonacci(i - 2 );
        }
    }
}
