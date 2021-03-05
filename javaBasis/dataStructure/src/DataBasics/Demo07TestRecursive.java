package DataBasics;

//递归
public class Demo07TestRecursive {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int i){
        if(i > 0){
            System.out.println(i);
            print(i-1);
        }
    }
}
