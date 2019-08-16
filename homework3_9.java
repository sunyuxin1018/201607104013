package day03.com.syx3;

import java.util.Scanner;

public class homework3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长:");
        int a = sc.nextInt();
        System.out.println("请输入长方形的宽:");
        int b = sc.nextInt();
        System.out.println("请输入圆形的半径:");
        int c = sc.nextInt();
        jisuan(a,b,c);
    }

    public static void jisuan(int a,int b,int c) {
        int C = 2*(a+b);
        int S = a*b;
        double C1 = 3.14*2*c;
        double S1 = 3.14*c*c;
        System.out.println("长方形的周长为:"+C);
        System.out.println("长方形的面积为:"+S);
        System.out.println("圆的周长为:"+C1);
        System.out.println("圆的周长为:"+S1);
    }
}
