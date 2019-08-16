package day03.com.syx3;

import java.util.Scanner;

public class homework3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个年份");
        int a = sc.nextInt();
        System.out.println("请输入第二个年份");
        int b = sc.nextInt();
        runnian(a,b);
    }

    public static void runnian(int a,int b) {
        for (int i = a; i < b; i++) {
            if (i%100==0&&i%400==0){
                System.out.println(i+"年是闰年");
            }else if(i%4==0){
                System.out.println(i+"年是闰年");
            }
        }
    }
}
