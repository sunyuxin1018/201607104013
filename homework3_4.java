package day03.com.syx3;

import java.util.Scanner;

public class homework3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        hhh(a);
    }

    public static void hhh(int a) {
        if(a>=0&&a<60){
            System.out.println("E");
        }else if(a>=60&&a<70){
            System.out.println("D");
        }else if(a>=70&&a<80){
            System.out.println("C");
        }else if(a>=80&&a<90){
            System.out.println("B");
        }else if(a>=90&&a<100){
            System.out.println("A");
        }else{
            System.out.println("F");
        }
    }
}
