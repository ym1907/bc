package DataBasics;

public class Test02 {
    public static void main(String[] args) {
        double num = 10000;
        int percent = 0;
        while (num < 20000){
            num += num*0.01;
            percent += 1;
            System.out.println("涨1%，第"+percent+"次，余额："+Math.round(num)+",本次涨了："+Math.round(num*0.01));
        }
        System.out.println("******************************************");

        double num3 = 20000;
        int percent3 = 0;
        while (num3 > 10000){
            num3 -= num3*0.01;
            percent3 += 1;
            System.out.println("跌1%，第"+percent3+"次，余额："+Math.round(num3)+",本次跌了："+Math.round(num3*0.01));
        }
//        System.out.println("一次跌1%，跌到"+Math.round(num3)+"，约"+percent3+"次");

        double num2 = 10000;
        int percent2 = 0;
        while (num2 < 20000){
            num2 += num2*0.02;
            percent2 += 1;
        }
        System.out.println("一次涨2%，涨到"+Math.round(num2)+"，约"+percent2+"次");

        double num4 = 20000;
        int percent4 = 0;
        while (num4 > 10000){
            num4 -= num4*0.02;
            percent4 += 1;
        }
        System.out.println("一次跌2%，跌到"+Math.round(num4)+"，约"+percent4+"次");
    }
}
