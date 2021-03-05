package DataBasics;

//汉诺塔
public class Demo09Hanoi {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        hanoi(2,'A','B','C');
        long t2 = System.currentTimeMillis();
        System.out.println("耗时：" + (t2-t1) + "毫秒");
    }

    public static void hanoi(int n,char A,char B,char C){
        if(n==1){
            System.out.println("第1个盘子从："+A+" 移动到："+C);
        }else{
            //上面所有的盘子从左边移到中间
            hanoi(n-1,A,C,B);
            System.out.println("第"+n+"个盘子从："+A+" 移动到："+C);
            //上面所有的盘子从中间移到右边
            hanoi(n-1,B,A,C);
        }
    }
}
