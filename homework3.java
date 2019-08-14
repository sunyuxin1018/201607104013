package day02.com.syx2;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数:");
        int number = scanner.nextInt();
        int b = number % 10;
        int c = (number / 10) % 10;
        int d = number / 100;
        int e = 0;
        for (int i = 100; i < 1000; i++) {
            if (b != 7 & c != 5 & d != 3) {
                e = e + i;
            }
        }
        System.out.println("满足条件的数字之和为："+e);
    }
}

