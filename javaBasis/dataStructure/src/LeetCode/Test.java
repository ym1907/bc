package LeetCode;

public class Test {
    public static void main(String[] args) {
        int[] p = {1,2,3,4};
        int a = 1;
        System.out.println(p[1]);
        System.out.println(p[a]);
        System.out.println(p[a++]);
    }
    public void reverseString(char[] s) {
        int L = 0;
        int R = s.length-1;
        while(L < R){
            s[L] = (char)(s[L] ^ s[R]);
            s[R] = (char)(s[L] ^ s[R]);
            s[L] = (char)(s[L] ^ s[R]);
            L++;
            R--;
        }
    }
}
