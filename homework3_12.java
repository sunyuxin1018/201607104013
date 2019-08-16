package day03.com.syx3;

import java.util.Scanner;

public class homework3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        jisuan(a);
    }

    public static int jisuan(int a) {
        int b = 0;
        while(a>=1) {
            a/=10;
            b++;
        }
        System.out.println("是"+b+"位数字");
        return b;
    }
}
